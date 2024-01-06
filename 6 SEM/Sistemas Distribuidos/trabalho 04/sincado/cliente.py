import socket
import time

def main():
    host = 'localhost'
    port = 12345

    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect((host, port))

    while True:
        server_time_str = client_socket.recv(1024).decode()
        if server_time_str:
            server_time = float(server_time_str)
            client_time = time.time() # O tempo do cliente não é modificado
            client_socket.send(str(client_time).encode())
            adjustment_str = client_socket.recv(1024).decode()
            adjustment = float(adjustment_str)
            print(f"Valor de adjustment: {adjustment}")
            client_time += adjustment
            print(f"Tempo ajustado: {client_time}")
        time.sleep(5)

if __name__ == '__main__':
    main()