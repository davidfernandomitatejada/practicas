package persona;

public class Alumno extends Persona {
    private final String grado;

    public Alumno(String nombre, String apellido, int edad, String grado) {
        super(nombre, apellido, edad, "Alumno");
        this.grado = grado;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Grado: " + grado);
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando para su examen.");
    }
}