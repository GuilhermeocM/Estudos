vetor = []
for n in range(0,5):
  num = int(input("Digite o numero {0}/10 do vetor ".format(n + 1)))
  vetor.append(num)
cod = int(input("Digite o codigo "))
if cod != 0 and cod < 3:
  if cod == 1:
    for a in vetor:
      print(a)
  if cod == 2:
    vetor.reverse()
    for c in vetor:
      print(c)