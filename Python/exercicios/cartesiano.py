from itertools import combinations

n = int(input("Digite o tamanho do array: "))
arr1 = input(f"Digite os {n} elementos do array: ")
arr = arr1.split(" ")
arr = [int(x) for x in arr]



def positive_value(arr):

    tuplas = []
    lista = []
    smallest_value = -1

    for i in range(1, len(arr)+1):
        tuplas.extend(combinations(arr,i))

    for i in tuplas:
        num = sum(list(i))
        lista.append(num)

    for x in range(1, 1000):
        if x not in lista:
            smallest_value = x
            break
    return smallest_value

print(positive_value(arr))