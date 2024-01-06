from datetime import datetime
import random
from time import sleep
import requests

base_url = 'http://localhost:5000'


# Função para imprimir a resposta formatada
def print_response(response):
    print(f'Status Code: {response.status_code}')
    print('Resposta JSON:')
    try:
        data = response.json()
        print(data)
    except ValueError:
        print('A resposta não contém dados JSON.')


date=datetime.now().strftime("%d/%m/%Y%-HH%MM")


while True:
    sleep(10)
    temperatura = random.randint(0,70)
    umidade = random.randint(0,100)
    visibilidade = random.randint(0,100)
    date = datetime.now().strftime("%d/%m/%Y%-HH%MM")
    

    # Criar um novo livro

    nova_previsao = {'temperatura': temperatura, 'umidade': umidade,'visibilidade':visibilidade,'data_hora':date}
    print(nova_previsao)
    response = requests.post(f'{base_url}/previsoes', json=nova_previsao)
    print('Criar um novo livro:')
    print_response(response)


"""
# Atualizar um livro existente (substitua <ID_DO_LIVRO> pelo ID do livro desejado)
id_previsao = 2
previsao_atualizado = {'temperatura': 72, 'umidade': 92,'visibilidade':82,"data_hora":date}
response = requests.put(f'{base_url}/previsoes/{id_previsao}', json=previsao_atualizado,)
print(f'Atualizar informações do livro com ID {id_previsao}:')
print_response(response)

"""
"""
#Excluir um livro existente (substitua <ID_DO_LIVRO> pelo ID do livro desejado)
id_previsao = 1
response = requests.delete(f'{base_url}/previsoes/{id_previsao}',)
print(f'Excluir livro com ID {id_previsao}:')
print_response(response)
"""