package persona;

public class Director extends Persona {
    public Director(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad, "Director");
    }

    public void gestionarEscuela() {
        System.out.println(nombre + " está gestionando la escuela.");
    }
}