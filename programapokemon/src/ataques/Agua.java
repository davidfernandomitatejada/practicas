package ataques;

import modelos.Pokemon;

public class Agua extends Pokemon {
    public Agua(String nombre, int edad, String rareza) {
        super(nombre, "Agua", edad, rareza);
    }

    public void pistolaAgua() {
        System.out.println(nombre + " usó Pistola de Agua! 🌊");
    }

    public void hidroBomba() {
        System.out.println(nombre + " lanzó Hidro Bomba! 💦");
    }

    public void surf() {
        System.out.println(nombre + " usó Surf! 🌊");
    }
}