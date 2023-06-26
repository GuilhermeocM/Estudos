vetor1 = []
vetor2 = []
vetor3 = []
for n1 in range(1, 11):
  v1 = int(input("Digite o numero {0}/10 do vetor 1 ".format(n1)))
  vetor1.append(v1)
for n2 in range(1, 11):
  v2 = int(input("Digite o numero {0}/10 do vetor 2 ".format(n2)))
  vetor2.append(v2)
for n in range(0,10):
  vetor3.append(vetor1[n] + vetor2[n])
for v3 in vetor3:
  print(v3)