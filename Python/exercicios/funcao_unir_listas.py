lista1 = ['Salvador', 'Ubatuba', 'Belo Horizonte']
lista2 = ['BA', 'SP', 'MG', 'RJ']


def unir_listas(lista1, lista2):
    lista3 = [(lista1[x], lista2[x]) for x in range(min(len(lista1), len(lista2)))]
    lista4 = [lista1[x] + ' - ' + lista2[x] for x in range(min(len(lista1), len(lista2)))]
    return print(lista3, '\n\n', lista4)


unir_listas(lista1, lista2)


lista5 = list(zip(lista1, lista2))

print()
print(lista5)
print()


#zip_longest(usa lista maior e retorna None para indice sem valor ou pode usar
# fillvalue= 'o que vc quizer')