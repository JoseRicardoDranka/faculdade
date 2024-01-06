import socket
import time
import random

def main():
    host = 'localhost'
    port = 12345

    # Crie uma conexão com o servidor
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    try:
        client_socket.connect((host, port))
    except ConnectionError as e:
        print(f"Erro de conexão: {e}")
        return
    
    while True:
        try:
            # Obtenha a hora local com variação aleatória
            local_time = 00.00 + round(random.uniform(3, 59), 2)
            local_time_str = str(local_time)
            print(local_time)
            
            # Envie a hora local para o servidor
            client_socket.send(local_time_str.encode())
            
            # Receba e decodifique a hora ajustada do servidor
            hora_ajustada_str = client_socket.recv(1024).decode()
            hora_ajustada = float(hora_ajustada_str)
            local_time= -hora_ajustada
            
            print("Após ajuste:", hora_ajustada)
            print("local",local_time)
            
            # Simule um atraso
            time.sleep(5)
        except ConnectionError as e:
            print(f"Erro de conexão: {e}")
            break
        except Exception as e:
            print(f"Erro: {e}")
            break
    
    # Feche a conexão com o servidor
    client_socket.close()

if __name__ == '__main__':
    main()