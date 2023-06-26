cont = 0
p1 = 0
p2 = 0
p3 = 0
p4 = 0
d1 = 0
d2 = 0
d3 = 0
d4 = 0
i = int(input("Digite o id do mouse "))
while i != 0:
  d = int(input("Digite o defeito do mouse\n1 - necessita de esfera\n2 - necessita de limpeza\n3 - necessita troca cabo ou conector\n4 - quebrado ou inutilizado "))
  cont = cont + 1
  if d == 1:
    d1 = d1 + 1
  if d == 2:
    d2 = d2 + 1
  if d == 3:
    d3 = d3 + 1
  if d == 4:
    d4 = d4 + 1
  i = int(input("\nDigite o id do mouse "))
  
p1 = d1 / cont * 100
p2 = d2 / cont * 100
p3 = d3 / cont * 100
p4 = d4 / cont * 100
print("\n\nTotal de mouses {0}".format(cont))
print("Situaçao               quant    percentual")
print("Necessita de esfera    {0}        {1}%".format(d1, p1))
print("Necessita de esfera    {0}        {1}%".format(d2, p2))
print("Necessita de esfera    {0}        {1}%".format(d3, p3))
print("Necessita de esfera    {0}        {1}%".format(d4, p4))