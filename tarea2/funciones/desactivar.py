from funciones.clase import Cuenta

class DesactivarCuenta(Cuenta):
    def desactivar(self):
        self.estado = False
        return print("Cuenta desactivada correctamente.")