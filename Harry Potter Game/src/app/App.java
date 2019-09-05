
package app;

import java.util.Scanner;

import app.artefactos.Artefacto;
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
        System.out.println("Por favor respeta las mayusculas y minusculas");
        Duels.listadoPersonajes();
        String p1 = Teclado.nextLine();
        Personaje primerMago = Duels.verPersonaje(p1);

        elementoMagico(primerMago);
        artefactoMagico(primerMago);

        return primerMago;
    }

    public static Personaje seleccPersonaje2() {
        System.out.println("\nIngresa el nombre del segundo jugador!\n");
        System.out.println("Por favor respeta las mayusculas y minusculas");

        Duels.listadoPersonajes();
        String p2 = Teclado.nextLine();
        Personaje segundoMago = Duels.verPersonaje(p2);

        elementoMagico(segundoMago);
        artefactoMagico(segundoMago);

        return segundoMago;
    }

    public static Hechizo elementoMagico(Personaje perso) {
        if (perso instanceof IHacerMagia) {
            IHacerMagia magia = (IHacerMagia) perso;
            System.out.println("¡Elige tu hechizo!");
            System.out.println("\nIngresa el nombre del hechizo que queres obtener!\n");
            System.out.println("Por favor respeta las mayusculas y minusculas");


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

    public static Artefacto artefactoMagico(Personaje perso) {
        if (perso instanceof IHacerMagia) {
            IHacerMagia magia = (IHacerMagia) perso;
            System.out.println("Elige tu artefacto");
            System.out.println("\nIngresa el nombre del artefacto que queres obtener!\n");
            System.out.println("Por favor respeta las mayusculas y minusculas");


            Duels.listadoArtefactos();
            String artefacto = Teclado.nextLine();
            Artefacto arte = Duels.verArtefacto(artefacto);

            if (magia.getArtefacto() != null) {
                System.out.println("El artefacto escogido es " + arte); 
            }

            return arte;

        }
        return null;

    }

    public static void juegoFull(Personaje primerJugador, Personaje segundoJugador) {
        IHacerMagia magia;

        Hechizo h = new Hechizo();
        Hechizo hechi = new Hechizo();
        


            magia = (IHacerMagia) primerJugador;
            while (primerJugador.salud > 0 && segundoJugador.salud > 0) {
            if (primerJugador instanceof IHacerMagia && segundoJugador instanceof IHacerMagia) {
                System.out.println(primerJugador.nombre + " ataca a " + segundoJugador.nombre);
                magia.atacar(segundoJugador, h);
                System.out.println("La salud del segundo jugador es: " + segundoJugador.salud);
                System.out.println(segundoJugador.nombre + " ataca a " + primerJugador.nombre);
                magia.atacar(primerJugador, hechi);
                System.out.println("La salud del primer jugador es " + primerJugador.salud);
        
            } else {
                System.out.println("Un jugado no tiene magia");
            }

        }
    }
}

