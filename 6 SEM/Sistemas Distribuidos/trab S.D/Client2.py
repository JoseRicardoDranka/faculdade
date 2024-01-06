import requests
from requests.auth import HTTPBasicAuth

# Defina a URL base do servidor Flask
base_url = 'http://localhost:5000'  # Atualize com o endereço do seu servidor Flask

# Função para imprimir a resposta formatada
def print_response(response):
    print(f'Status Code: {response.status_code}')
    print('Resposta JSON:')
    try:
        data = response.json()
        print(data)
    except ValueError:
        print('A resposta não contém dados JSON.')

"""
# Obter a lista de livros
response = requests.get(f'{base_url}/previsoes')
print('Obter a lista de previsoes:')
print_response(response)

"""
# Obter informações de um livro específico (substitua <ID_DO_LIVRO> pelo ID do livro desejado)
id_previsao = 3
response = requests.get(f'{base_url}/previsoes/{id_previsao}')
print(f'Obter informações do livro com ID {id_previsao}:')
print_response(response)






