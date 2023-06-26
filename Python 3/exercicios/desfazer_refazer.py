import json
from pathlib import Path

lista = []
checar = ['LISTAR', 'DESFAZER', 'REFAZER']
elementos_excluido = []
local = Path(__file__).parent / 'desfazer_refazer.json'


while True:
    with open(local, 'w', encoding='utf8') as arquivo:
        json.dump(lista, arquivo, indent=2)

    comando = input('Digite um comando \nListar, Desfazer, Refazer ou digite a tarefa a ser inclusa: \n\n').upper()
    print('\n \n')

    if comando not in checar:
        lista.append(comando)

    if comando == 'LISTAR':
        for i in lista:
            print(i)
    
        print()
        print()
    try:
        if comando == 'DESFAZER':
            elemento_excluido = lista.pop()
            elementos_excluido.append(elemento_excluido)
    except:
        print('Não há o que desfazer! \n')

    try:
        if comando == 'REFAZER':
            lista.append(elementos_excluido[0])
            del elementos_excluido[0]
    except:
        print('Não há o que refazer! \n')