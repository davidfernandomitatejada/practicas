from funciones.activar import ActivarCuenta
from funciones.desactivar import DesactivarCuenta
from funciones.deposito import Deposito
from funciones.retiro import Retiro

cuenta1 = ActivarCuenta("123456", "Eddy Torrico", 1000)
cuenta1.activar()
cuenta1.mostrar_info()

cuenta2 = Deposito("123456", "David Tejada", 1000, True)
cuenta2.depositar(500)
cuenta2.mostrar_info()

cuenta3 = Retiro("123456", "Franco Mita", 1500, True)
cuenta3.retirar(300)
cuenta3.mostrar_info()

cuenta4 = DesactivarCuenta("123456", "Geovana Betancur", 1200, True)
cuenta4.desactivar()
cuenta4.mostrar_info()

