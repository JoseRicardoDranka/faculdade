import socket
import threading
import random

# define um array para armazenar tempo dos clientes
client_times = []

def handle_client(client_socket, clients, lock):
    while True:
        try:
            # recebe o tempo do cliente
            client_time_str = client_socket.recv(1024).decode()
            if not client_time_str:
                break

            client_time = float(client_time_str)

            # acrescente o tempo do cliente a lista
            client_times.append(client_time)

            server_time = 0.00 + round(random.uniform(3, 59), 2)
            adjustment = server_time - ((client_times[0]+client_times[1]+client_times[2]+client_times[3]+client_times[4])/5)

            # envia ajustes para o cliente
            client_socket.send(str(adjustment).encode())
        except ConnectionError as e:
            print(f"Erro de conexão: {e}")
            break
        except Exception as e:
            print(f"Error: {e}")
            break

        print(f'Antes do ajuste{server_time: .2f}')

        server_time = -adjustment
        print(f"Depois do ajuste{server_time: .2f}")

    # remove o cliente
    with lock:
        clients.remove(client_socket)
    client_socket.close()

def main():
    host = 'localhost'
    port = 12345

    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.bind((host, port))
    server_socket.listen(5)
    print(f"Escutando conexão em: {host}:{port}")

    clients = []
    lock = threading.Lock()

    while True:
        client_socket, addr = server_socket.accept()
        print(f"Conexão recebida de: {addr}")
        clients.append(client_socket)

        client_handler = threading.Thread(target=handle_client, args=(client_socket, clients, lock))
        client_handler.start()

        # limita a conexão para 5 clientes
        if len(client_times) >= 5:
            print("5 relogios conectados:", client_times[:5])
            break

if __name__ == '__main__':
    main()
