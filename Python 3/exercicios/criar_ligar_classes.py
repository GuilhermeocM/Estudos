class Carro:
    def __init__(self, nome):
        self.nome = nome
        self._m_carro = None
        self._f_carro = None

        @property
        def motor_carro(self):
            return self._m_carro

        @motor_carro.setter
        def motor_caro(self, valor):
            self._m_carro = valor

        @property
        def fabricante_carro(self):
            return self._f_carro

        @fabricante_carro.setter
        def fabricante_carro(self, valor):
            self._f_carro = valor

      

class Motor:
    def __init__(self, nome):
        self.nome = nome



class Fabricante:
    def __init__(self, nome):
        self.nome = nome



carro = Carro('Siena')
motor = Motor('Fireflex 1.4')
fabricante = Fabricante('Fiat')

carro.motor_carro = motor
carro.fabricante_carro = fabricante
print(carro.nome, carro.motor_carro.nome, carro.fabricante_carro.nome, sep='\n')
