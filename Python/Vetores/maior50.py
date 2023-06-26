vetor = []
ok = 1
for n in range(1, 11):
  num = int(input("Digite o numero {0}/10 do vetor ".format(n)))
  vetor.append(num)
for v in vetor:
  if v > 50:
    ok = 2
    print("{0} na posiçao {1}".format(v, vetor.index(v)))
if ok == 1:
    print("\nNao existem numeros maiores que 50")