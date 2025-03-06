package ataques;

import modelos.Pokemon;

public class Tierra extends Pokemon {
    public Tierra(String nombre, int edad, String rareza) {
        super(nombre, "Tierra", edad, rareza);
    }

    public void terremoto() {
        System.out.println(nombre + " provocó un Terremoto! 🌍");
    }

    public void excavar() {
        System.out.println(nombre + " usó Excavar! 🏜️");
    }

    public void disparoLodo() {
        System.out.println(nombre + " lanzó Disparo de Lodo! 🌾");
    }
}