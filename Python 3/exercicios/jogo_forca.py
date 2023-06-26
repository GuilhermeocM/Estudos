import os
palavra_secreta = 'violao'
letras_p_checar = ''
contador = 0

while True:
    letra = input('Digite uma letra: ')

    if letra in palavra_secreta:
        letras_p_checar += letra
        contador += palavra_secreta.count(letra)

    for i in palavra_secreta:
        if i in letras_p_checar:
            print(i, end='')
        else:
            print('*', end='')
    print()

    if contador == len(palavra_secreta):
        os.system('cls')
        print('Você venceu!!!')
        break