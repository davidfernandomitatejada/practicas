import ataques.Agua;
import ataques.Electrico;
import ataques.Fuego;
import ataques.Tierra;

public class Main {
    public static void main(String[] args) {
        // Pokémon tipo Agua
        Agua squirtle = new Agua("Squirtle", 2, "Común");
        squirtle.mostrarInfo();
        squirtle.pistolaAgua();
        squirtle.hidroBomba();
        squirtle.surf();

        System.out.println();

        // Pokémon tipo Eléctrico
        Electrico pikachu = new Electrico("Pikachu", 3, "Raro");
        pikachu.mostrarInfo();
        pikachu.impactrueno();
        pikachu.rayo();
        pikachu.trueno();

        System.out.println();

        // Pokémon tipo Fuego
        Fuego charmander = new Fuego("Charmander", 2, "Raro");
        charmander.mostrarInfo();
        charmander.ascuas();
        charmander.lanzallamas();
        charmander.fuegoFatuo();

        System.out.println();

        // Pokémon tipo Tierra
        Tierra sandshrew = new Tierra("Sandshrew", 4, "Común");
        sandshrew.mostrarInfo();
        sandshrew.terremoto();
        sandshrew.excavar();
        sandshrew.disparoLodo();
    }
}