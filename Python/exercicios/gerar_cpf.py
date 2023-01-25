import random

cpf = ''

for i in range(9):
    cpf += str(random.randint(0, 9))

resultado = 0
resultado2 = 0
primeiro_digito = 0
segundo_digito = 0

for i in range(10, 1, -1):
    resultado += i * int(cpf[10 - i])
primeiro_digito = (resultado * 10) % 11
primeiro_digito = 0 if primeiro_digito > 9 else primeiro_digito

cpf2 = cpf[:9] + str(primeiro_digito)

for i in range(11, 1, -1):
    resultado2 += i * int(cpf2[11 - i])
segundo_digito = (resultado2 * 10) % 11
segundo_digito = 0 if segundo_digito > 9 else segundo_digito

novo_cpf = cpf2 + str(segundo_digito)

print(novo_cpf)