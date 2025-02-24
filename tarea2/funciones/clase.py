class Cuenta:
    def __init__(self, numero_cuenta, nombre_titular, saldo, estado=False):
        self.numero_cuenta = numero_cuenta
        self.nombre_titular = nombre_titular
        self.saldo = saldo
        self.estado = estado  

    def mostrar_info(self):
        estado_cuenta = "Activa" if self.estado else "Inactiva"
        return print(f"Cuenta: {self.numero_cuenta}, Titular: {self.nombre_titular}, Saldo: {self.saldo}, Estado: {estado_cuenta}")

