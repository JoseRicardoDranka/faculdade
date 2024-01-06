from flask import Flask, current_app, flash, jsonify, make_response, redirect, request, url_for, abort
from flask_httpauth import HTTPBasicAuth

app = Flask(__name__)
autenticacao = HTTPBasicAuth()

# Dados de exemplo para a API
previsoes = [
    {'id': 1, 'temperatura': 28, 'umidade': 65 ,'visibilidade':42,'data_hora':'2023-09-28: 20:18'},
    {'id': 2, 'temperatura': 42, 'umidade': 45,'visibilidade':42,'data_hora':'2023-09-28: 20:18'}
]

# Rotas para a API
@app.route('/previsoes', methods=['GET'])
def obter_previsoes():
    return jsonify({'': previsoes})

@app.route('/previsoes/<int:id_previsao>', methods=['GET'])
def obter_previsao(id_previsao):
    previsao_encontrado = None
    for previsao in previsoes:
        if previsao['id'] == id_previsao:
            previsao_encontrado = previsao
            break  

    if not previsao_encontrado: 
        abort(404)
    return jsonify({'previsao': previsao_encontrado})


@app.route('/previsoes', methods=['POST'])
def criar_previsao():
    if not request.json or 'temperatura' not in request.json:
        abort(400)
    previsao = {
        'id': previsoes[-1]['id'] + 1,
        'temperatura': request.json['temperatura'],
        'umidade': request.json['umidade'],
        'visibilidade': request.json['visibilidade'],
        'data_hora': request.json['data_hora']
    }
    previsoes.append(previsao)
    return jsonify({'previsao': previsao}), 201

@app.route('/previsoes/<int:id_previsao>', methods=['PUT'])
def atualizar_previsao(id_previsao):
    previsao = None
    for p in previsoes:
        if p['id'] == id_previsao:
            previsao = p
            break

    if not previsao:
        abort(404)
    if not request.json:
        abort(400)

    previsao['temperatura'] = request.json.get('temperatura', previsao['temperatura'])
    previsao['umidade'] = request.json.get('umidade', previsao['umidade'])
    previsao['visibilidade'] = request.json.get('visibilidade',previsao['visibilidade'])
    previsao['data_hora'] = request.json.get('data_hora',previsao['data_hora'])
    return jsonify({'previsao': previsao})

@app.route('/previsoes/<int:id_previsao>', methods=['DELETE'])
def excluir_previsao(id_previsao):
    previsao = None
    for p in previsoes:
        if p['id'] == id_previsao:
            previsao = p
            break

    if not previsao:
        abort(404)
    previsoes.remove(previsao)
    return jsonify({'resultado': True})


if __name__ == "__main__":
    print('Servidor em execução...')
    app.run(debug=True)
