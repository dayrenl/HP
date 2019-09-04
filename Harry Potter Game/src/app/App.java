
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

        Personaje primerJugador = seleccPersonaje1();
        Personaje segundoJugador = seleccPersonaje2();
        

        juegoFull(primerJugador, segundoJugador);

    }

    public static Personaje seleccPersonaje1() {

        System.out.println("\nIngresa el nombre del primer jugador!\n");
        Duels.listadoPersonajes();
        String p1 = Teclado.nextLine();
        Personaje primerMago = Duels.verPersonaje(p1);

        elementoMagico(primerMago);

        return primerMago;
    }

    public static Personaje seleccPersonaje2() {
        System.out.println("\nIngresa el nombre del segundo jugador!\n");
        Duels.listadoPersonajes();
        String p2 = Teclado.nextLine();
        Personaje segundoMago = Duels.verPersonaje(p2);

        elementoMagico(segundoMago);

        return segundoMago;
    }

    public static Hechizo elementoMagico(Personaje perso) {
        if (perso instanceof IHacerMagia) {
            IHacerMagia magia = (IHacerMagia) perso;
            System.out.println("¡TENES QUE ELEGIR 3 HECHIZOS!");
            System.out.println("\nIngresa el nombre del hechizo que queres obtener!\n");

            Duels.listadoHechizos();
            String hechizo = Teclado.nextLine();
            Hechizo h = Duels.verHechizo(hechizo);

            if (magia.getHechizo(h.nombreDeHechizo) != null) {
                magia.aprenderHechizo(h);
            }

            return h;

        }
        return null;

    }

    public static void juegoFull(Personaje primerJugador, Personaje segundoJugador) {
        IHacerMagia magia;

        Hechizo h = new Hechizo();
        Hechizo hechi = new Hechizo();

        while (primerJugador.salud > 0 && segundoJugador.salud > 0) {

            magia = (IHacerMagia) primerJugador;
            if (primerJugador instanceof IHacerMagia) {
                System.out.println(primerJugador.nombre + " ataca a " + segundoJugador.nombre);
                magia.atacar(segundoJugador, h);
                System.out.println("La salud del segundo jugador es: " + segundoJugador.salud);
                System.out.println(segundoJugador.nombre + " ataca a " + primerJugador.nombre);
                magia.atacar(primerJugador, hechi);
                System.out.println("La salud del primer jugador es " + primerJugador.salud);

            }

        }
    }

}

/**
 * System.out.println("Ingresa el nombre del personaje que sera el primer
 * jugador"); System.out.println("Harry Potter");
 * System.out.println("Hermione"); System.out.println("Severus Snape");
 * System.out.println("Dobby"); System.out.println("Kreacher");
 * System.out.println("Dudley Dursley"); System.out.println("Petunia Potter");
 * String perso1 = Teclado.nextLine();
 * 
 * Personaje primerJugador = Duels.verPersonaje(perso1); System.out.println("\n
 * El personaje que ha escogido es " + perso1 + "\n");
 * 
 * if (primerJugador instanceof IHacerMagia) { IHacerMagia primerMago =
 * (IHacerMagia) primerJugador; System.out.println( "Ingresa el nombre de los
 * hechizos que quieras aprender! Presiona '666' para elegir Artefactos");
 * System.out.println("Presiona '666' para elegir Artefactos");
 * Duels.listadoHechizos(); String hech = Teclado.nextLine(); Hechizo
 * primerHechizo = Duels.verHechizo(hech); System.out.println("El hechizo que ha
 * escogido es " + hech);
 * 
 * }
 * 
 * } }
 * 
 */