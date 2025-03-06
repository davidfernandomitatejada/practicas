import persona.Alumno;
import persona.Director;
import persona.Maestro;
import persona.Conserje;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada rol
        Alumno alumno1 = new Alumno("Carlos", "Gómez", 16, "10° Grado");
        Maestro maestro1 = new Maestro("Ana", "Pérez", 35, "Matemáticas");
        Director director1 = new Director("Roberto", "López", 50);
        Conserje conserje1 = new Conserje("José", "Martínez", 45);

        // Llamar a los métodos que ya imprimen directamente
        alumno1.mostrarInfo();
        alumno1.estudiar();
        alumno1.hacerTarea();

        maestro1.mostrarInfo();
        maestro1.darClase();

        director1.mostrarInfo();
        director1.gestionarEscuela();

        conserje1.mostrarInfo();
        conserje1.limpiarEscuela();
    }
}