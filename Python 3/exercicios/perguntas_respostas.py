perguntas = [
    {
        'Pergunta' : 'O menino Dri se considera:',
        'Alternativas' : ['a) Homosexual',  'b) Bisexual',  'c) LGBTQIA+',  'd) Pansexual'],
        'Resposta' : 'd',
    },
    {
        'Pergunta' : 'O penis do Ph tem quantos cm?',
        'Alternativas' : ['a) 4cm',  'b) 8cm',  'c) 7cm',  'd) 3cm'],
        'Resposta' : 'c',
    },
    {
        'Pergunta' : 'O Felim gosta de...',
        'Alternativas' : ['a) Pau',  'b) Pomba',  'c) Marreta',  'd) Pica'],
        'Resposta' : 'b',
    }
]

for dicionario in perguntas:
    print(dicionario['Pergunta'])
    print()
    for alternativas in dicionario['Alternativas']:
        print(alternativas)
        print()
    resposta = input('Digite a letra correspondente a resposta: ')
    if resposta == dicionario['Resposta']:
        print()
        print('Você acertou \U0001F600')
        print()
        print()
    else:
        print()
        print('Você errou \U0001F614')
        print()
        print()
