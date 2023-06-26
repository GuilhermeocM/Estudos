n = int(input("Digite um numero "))
if n % 2 == 0 and n >= 0:
  print("{0} é par e positivo".format(n))
elif n % 2 == 0 and n < 0:
  print("{0} é par e negativo".format(n))
elif n % 2 != 0 and n >= 0:
  print("{0} é impar e positivo".format(n))
elif n % 2 != 0 and n < 0:
  print("{0} é impar e negativo".format(n))