from funciones.clase import Cuenta
class Retiro(Cuenta):
    def retirar(self, monto):
        if not self.estado:
            return "Error: La cuenta está inactiva."
        if monto > self.saldo:
            return "Saldo insuficiente."
        self.saldo -= monto
        return print(f"Retiro exitoso. Nuevo saldo: {self.saldo}")