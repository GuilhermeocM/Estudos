vetor = []
pares = []
for n in range(0, 5):
  vetor.append(n)
  if n % 2 == 0 and n > 0:
    pares.append(n)
for p in pares:
   print(p)