horas = input('Que horas são? ')
horas = horas.replace(':', '.')
try:
    horas = float(horas)
    dia = 0 <= horas <= 11.59
    tarde = 12 <= horas <= 17.59
    noite = 18 <= horas <= 23.59

    if dia:
        print('Bom dia!')
    elif tarde:
        print('Boa tarde!')
    elif noite:
        print('Boa noite!')
    else:
        print('Isto não é um horario')
except:
    print('Isto não é um horario!')