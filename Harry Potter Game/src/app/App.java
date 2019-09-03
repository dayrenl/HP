
package app;

import java.util.Scanner;

import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;

/**
 * App
 */
public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Bienvenidxs al Campeonato de Magia y Hechiceria");
        System.out.println("Inicializando catalogo de personajes ");

        Duels.inicioDuelo();

        

        System.out.println("Ingresa el nombre del personaje que sera el primer jugador");
        System.out.println("Harry Potter");
        System.out.println("Hermione");
        System.out.println("Severus Snape");
        System.out.println("Dobby");
        System.out.println("Kreacher");
        System.out.println("Dudley Dursley");
        System.out.println("Petunia Potter");
        String perso1 = Teclado.nextLine();

        Personaje primerJugador = Duels.verPersonaje(perso1); 
        System.out.println("\n El personaje que ha escogido es " + perso1 + "\n");

        if (primerJugador instanceof IHacerMagia) {
            IHacerMagia primerMago = (IHacerMagia) primerJugador;
            System.out.println(
                    "Ingresa el nombre de los hechizos que quieras aprender! Presiona '666' para elegir Artefactos");
            System.out.println("Presiona '666' para elegir Artefactos");
            Duels.listadoHechizos();
            String hech = Teclado.nextLine();
            Hechizo primerHechizo = Duels.verHechizo(hech);
            System.out.println("El hechizo que ha escogido es " + hech);

        }

    }
}
