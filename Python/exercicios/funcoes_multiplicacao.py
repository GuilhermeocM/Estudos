def multiplica(numero_multiplicador):
    def multiplicador(numero):
        return numero_multiplicador * numero
    return multiplicador



duplica = multiplica(2)
triplica = multiplica(3)
quadruplica = multiplica(4)

print(duplica(6))
print(triplica(6))
print(quadruplica(6))
