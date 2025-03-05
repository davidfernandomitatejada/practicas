package persona;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String rol;

    public Persona(String nombre, String apellido, int edad, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rol = rol;
    }

    // Método que imprime la información directamente
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido +
                ", Edad: " + edad + ", Rol: " + rol);
    }
}