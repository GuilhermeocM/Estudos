import json

CAMINHO_ARQUIVO = 'C:\\Users\\User\\Gui\\Python\\vscode\\exercicios\\classe_json.json'

class Pessoa:
    def __init__(self, nome, idade,):
        self.nome = nome
        self.idade = idade


p1 = Pessoa('Gui', 30)
dados_dic = p1.__dict__


def fazer_dump():
    with open(CAMINHO_ARQUIVO, 'w', encoding='utf8') as arquivo:
        json.dump(dados_dic, arquivo, indent= 2)

if __name__ == '__main__':
    print('Dump')
    fazer_dump()