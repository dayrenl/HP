package app;

import java.util.Scanner;

import app.Duels;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidxs al Campeonato de Magia y Hechiceria");

        System.out.println("Inicializando catalogo de personajes ");

        Duels.inicioDuelo();

        Personaje primerJugador = new Personaje();
        primerJugador = setJugador();
        Personaje segundoJugador = new Personaje();
        segundoJugador = setJugador();

    }

    public static Personaje setJugador() {
        System.out.println("ESTAS ELIGIENDO AL PRIMER JUGADOR\n");
        System.out.println("Ingresa el '1' para elegir al primer jugador!");
        int op = Teclado.nextInt();
        Teclado.nextLine();

        while (op <= 1) {
            switch (op) {
            case 1:
                eleccionElementos();

                break;

            default:
                break;
            }
        }

        return null;

    }

    public static void eleccionElementos() {

        System.out.println("Ingrese el nombre del personaje que sera su primer jugador!");
        Duels.listadoPersonajes();
        String p1 = Teclado.nextLine();
        Personaje primerJugador = Duels.verPersonaje(p1);

        if (primerJugador instanceof IHacerMagia) {
            IHacerMagia primerMago = (IHacerMagia) primerJugador;
            System.out.println("Ingresa el nombre de los hechizos que quieras aprender!");
            Duels.listadoHechizos();
            String hech = Teclado.nextLine();
            primerMago.aprenderHechizo(Hechizo.nombreDeHechizo);

        } 

    }

}

