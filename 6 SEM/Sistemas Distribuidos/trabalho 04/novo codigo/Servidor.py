import socket
import threading
import random
def handle_client(client_socket, clients, lock):
    while True:
        try:
            # recebe a hora do cliente
            client_time_str = client_socket.recv(1024).decode()
            if not client_time_str:
                break

            client_time = float(client_time_str)

            server_time = 0.00 +round(random.uniform(3,59),2) 
            adjustment = server_time - client_time
  
            #envia ajuste ao client 
            client_socket.send(str(adjustment).encode())
        except ConnectionError as e:
            print(f"Connection error: {e}")
            break
        except Exception as e:
            print(f"Error: {e}")
            break
        
        print(server_time)
        
        server_time= -adjustment    
        print("dps do ajuste", server_time)
    #remover client
    with lock:
        clients.remove(client_socket)
    client_socket.close()

def main():
    host = 'localhost'
    port = 12345

    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.bind((host, port))
    server_socket.listen(5)
    print(f"Listening for connections on {host}:{port}")

    clients = []
    lock = threading.Lock()


    while True:
        client_socket, addr = server_socket.accept()
        print(f"Connection received from {addr}")
        clients.append(client_socket)

        client_handler = threading.Thread(target=handle_client, args=(client_socket, clients, lock))
        client_handler.start()

if __name__ == '__main__':
    main()