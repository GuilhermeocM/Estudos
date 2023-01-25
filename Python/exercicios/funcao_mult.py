def multiplicacao(*args):
    mult = 1
    for i in args:
        mult *= i
    print(mult)
    return mult



multiplicacao(4, 5, 7, 8, 9)

print(4*5*7*8*9)



def par_or_impar(n):
    impar = n % 2 != 0
    if impar:
        return 'Impar'
    return 'Par'


print(par_or_impar(3))
