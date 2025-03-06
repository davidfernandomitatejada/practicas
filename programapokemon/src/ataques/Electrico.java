package ataques;

import modelos.Pokemon;

public class Electrico extends Pokemon {
    public Electrico(String nombre, int edad, String rareza) {
        super(nombre, "Eléctrico", edad, rareza);
    }

    public void impactrueno() {
        System.out.println(nombre + " lanzó Impactrueno! ⚡");
    }

    public void rayo() {
        System.out.println(nombre + " usó Rayo! ⚡");
    }

    public void trueno() {
        System.out.println(nombre + " invocó un Trueno! ⚡⚡");
    }
}