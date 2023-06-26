c = int(input("Informe o codigo "))
n = int(input("Informe o numero de horas trabalhadas "))
e = 0
s = (n - e) * 10
if n > 50:
  e = n - 50
print("O Salario é de R${0}".format(s))
print("O salario excedente é de R${0}".format(e * 20))
print("O salario total é de R${0}".format(s + (e * 20)))