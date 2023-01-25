from classe_json1 import CAMINHO_ARQUIVO, Pessoa
import json


with open(CAMINHO_ARQUIVO, 'r') as arquivo:
    dados = json.load(arquivo)

p1 = Pessoa(**dados)

print(p1.nome)
print(p1.idade)
