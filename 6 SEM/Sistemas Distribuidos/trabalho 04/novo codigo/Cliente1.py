import socket
import time
import random
import threading

def time_sync_thread(host, port):
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    try:
        client_socket.connect((host, port))
    except ConnectionError as e:
        print(f"Erro de conexão: {e}")
        return

    while True:
        try:
            local_time = 00.00 + round(random.uniform(3, 59), 2)
            local_time_str = str(local_time)
            print(f"Antes do ajuste {local_time:.2f}")

            client_socket.send(local_time_str.encode())


            hora_ajustada_str = client_socket.recv(1024).decode()
            hora_ajustada = float(hora_ajustada_str)
            local_time = -hora_ajustada

            print(f"Depois do ajuste {hora_ajustada:.2f}")

            time.sleep(5)
        except ConnectionError as e:
            print(f"Erro de conexão: {e}")
            break
        except Exception as e:
            print(f"Error: {e}")
            break

    client_socket.close()

def main():
    host = 'localhost'
    port = 12345

    threads = []
    for i in range(5):
        thread = threading.Thread(target=time_sync_thread, args=(host, port))
        threads.append(thread)
        thread.start()

    for thread in threads:
        thread.join()

if __name__ == '__main__':
    main()
