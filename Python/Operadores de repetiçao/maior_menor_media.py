maior = -999
menor = 999
for n in range(1, 11):
  n = int(input("Digite o numero {0}/10 sendo inteiro e positivo ".format(n)))
  if n > maior:
    maior = n
  if n < menor:
    menor = n
media = (maior + menor) / 2
print("O maior valor é {0}, o menor valor é {1}, a media dos valores é {2}".format(maior, menor, media))