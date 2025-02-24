from funciones.clase import Cuenta

class ActivarCuenta(Cuenta):
    def activar(self):
        self.estado = True
        return print("Cuenta activada correctamente.")