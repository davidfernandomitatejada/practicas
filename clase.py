class Cuenta:
    def __init__(self, numero_cuenta, nombre_titular, saldo, estado):
        self.numero_cuenta = numero_cuenta
        self.nombre_titular = nombre_titular
        self.saldo = saldo
        self.estado = estado  
    
    def activar(self):
        if self.estado:
            print("Cuenta ya está activada")
        else:
            self.estado = True
            print("Cuenta activada")
    
    def desactivar(self):
        if not self.estado:
            print("Cuenta ya está desactivada")
        else:
            self.estado = False
            print("Cuenta desactivada")

    def mostrar_datos(self):
        estado_str = "Activo" if self.estado else "Inactivo"
        print(f"Numero de cuenta: {self.numero_cuenta}\nNombre del titular: {self.nombre_titular}\nSaldo: {self.saldo}\nEstado: {estado_str}")

    def deposito(self, monto_deposito):
        self.saldo += monto_deposito
        return self.saldo

    def retiro(self, monto_retiro):
        if monto_retiro > self.saldo:
            print("Saldo insuficiente")
            return self.saldo
        self.saldo -= monto_retiro
        return self.saldo

cuenta1 = Cuenta(4567, "David Tejada", 2000, True)

cuenta1.mostrar_datos()
cuenta1.desactivar()
print(f"El saldo actual en su cuenta es de: {cuenta1.deposito(1000)}")

print(f"Su saldo actual en su cuenta es: {cuenta1.retiro(500)}")