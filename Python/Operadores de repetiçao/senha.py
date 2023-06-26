nome = input("Digite o nome ")
senha = input("Digite a senha ")
while nome == senha:
  print("ERRO! Nome deve ser diferente da senha")
  nome = input("Digite o nome ")
  senha = input("Digite a senha ")