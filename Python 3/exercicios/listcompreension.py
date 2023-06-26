import copy

produtos = [
    {'nome' : 'Produto 5', 'preco' : 10.00},
    {'nome' : 'Produto 1', 'preco' : 22.32},
    {'nome' : 'Produto 3', 'preco' : 10.11},
    {'nome' : 'Produto 2', 'preco' : 105.87},
    {'nome' : 'Produto 4', 'preco' : 69.90},
]


novos_produtos = [{**produto, 'preco' : round(produto['preco'] * 1.1, 2)} for produto in produtos]

produtos_ordem = sorted(copy.deepcopy(produtos), key= lambda p : p['nome'], reverse=True)

produtos_ordem_preco = sorted(copy.deepcopy(produtos), key= lambda p : p['preco'])

print(*produtos_ordem_preco, sep='\n')