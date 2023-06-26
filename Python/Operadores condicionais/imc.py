sexo = input("Informe seu sexo m/f ")
altura = float(input("Qual sua altura? "))
if sexo.lower() == 'm':
  peso_ideal = (72.7 * altura) - 58
  print(peso_ideal)
elif sexo.lower() == 'f':
  peso_ideal = (62.1 * altura) - 58
  print(peso_ideal)
else:
  print("Sexo nao reconhecido!")