num1 = int(input("Digite o primeiro numero "))
num2 = int(input("Digite o segundo numero  "))
num3 = int(input("Digite o terceiro numero "))
num4 = int(input("Digite o quarto numero   "))
pot1 = num1 * num1
pot2 = num2 * num2
pot3 = num3 * num3
pot4 = num4 * num4
if pot3 >= 1000:
  print(pot3)
else:
  print("O quadrado de {0} é {1}".format(num1, pot1))
  print("O quadrado de {0} é {1}".format(num2, pot2))
  print("O quadrado de {0} é {1}".format(num3, pot3))
  print("O quadrado de {0} é {1}".format(num4, pot4))