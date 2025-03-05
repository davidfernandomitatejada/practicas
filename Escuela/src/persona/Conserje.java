package persona;

public class Conserje extends Persona {
    public Conserje(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad, "Conserje");
    }

    public void limpiarEscuela() {
        System.out.println(nombre + " está limpiando la escuela.");
    }
}
