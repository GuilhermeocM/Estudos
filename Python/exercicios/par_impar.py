try:
    numero = int(input('Digite um numero inteiro: '))

    par = numero % 2 == 0

    if par:
        print('Esse numero é par')
    else:
        print('Esse numero é impar')
except:
    print('Este numero não é um inteiro!')