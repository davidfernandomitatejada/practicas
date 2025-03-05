package persona;

public class Maestro extends Persona {
    private final String materia;

    public Maestro(String nombre, String apellido, int edad, String materia) {
        super(nombre, apellido, edad, "Maestro");
        this.materia = materia;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Materia: " + materia);
    }

    public void darClase() {
        System.out.println(nombre + " está dando clase de " + materia + ".");
    }
}