package modelos;

public class Pokemon {
    protected String nombre;
    protected String tipo;
    protected int edad;
    protected String rareza;

    public Pokemon(String nombre, String tipo, int edad, String rareza) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.rareza = rareza;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Tipo: " + tipo + ", Edad: " + edad + " años, Rareza: " + rareza);
    }

    public void atacar() {
        System.out.println(nombre + " está atacando!");
    }
}