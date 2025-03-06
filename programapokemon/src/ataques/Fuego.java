package ataques;

import modelos.Pokemon;

public class Fuego extends Pokemon {
    public Fuego(String nombre, int edad, String rareza) {
        super(nombre, "Fuego", edad, rareza);
    }

    public void ascuas() {
        System.out.println(nombre + " usó Ascuas! 🔥");
    }

    public void lanzallamas() {
        System.out.println(nombre + " lanzó Lanzallamas! 🔥🔥");
    }

    public void fuegoFatuo() {
        System.out.println(nombre + " invocó Fuego Fatuo! 🔥👻");
    }
}