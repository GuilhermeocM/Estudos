while True:
    num1 = input('Digite um numero: ')
    num2 = input('Digite um segundo numero: ')
    operador = input('Digite o operado (+-/*): ')

    try:
        num1 = float(num1)
        num2 = float(num2)
    except:
        print('Um dos número que você digitou não é valido!')
        continue

    check = '+-/*'

    if operador not in check or len(operador) > 1:
        print('Digite um operador valido!')
        continue

    if operador == '+':
        resultado = num1 + num2
        print(resultado)
    if operador == '-':
        resultado = num1 - num2
        print(resultado)
    if operador == '*':
        resultado = num1 * num2
        print(resultado)
    if operador == '/':
        resultado = num1 / num2
        print(resultado)

    sair = input('Deseja sair? Digite sim: ').lower().startswith('s')
    if sair:
        break