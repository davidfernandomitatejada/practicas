from funciones.clase import Cuenta

class Deposito(Cuenta):
    def depositar(self, monto):
        if not self.estado:
            return "Error: La cuenta está inactiva."
        self.saldo += monto
        return print(f"Deposito exitoso. Nuevo saldo: {self.saldo}")

