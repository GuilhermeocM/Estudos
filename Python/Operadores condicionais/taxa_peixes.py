p = int(input("Qual o peso dos peixes "))
e = 0
m = 0
if p > 50:
  e = p - 50
  m = e * 4
  print("Houve um excesso de {0} quilos e voce devera pagar R$: {0} reais de multa.".format(e, m))
else:
  print("Nao houve excesso")