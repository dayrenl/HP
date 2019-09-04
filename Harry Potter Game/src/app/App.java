
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

    private static void juegoFull(Personaje primerJugador, Personaje segundoJugador) {
        IHacerMagia magia;

        while (primerJugador.isEstaVivo() && segundoJugador.isEstaVivo()) {
            if (primerJugador instanceof IHacerMagia) {
                magia = (IHacerMagia) primerJugador;
                System.out.println(primerJugador.nombre + " ataca a " + segundoJugador.nombre);
                magia.atacar(segundoJugador, hech);

            }
            
        }
    }

    private static Personaje seleccPersonaje1() {

        System.out.println("\nIngresa el nombre del primer jugador!\n");
        Duels.listadoPersonajes();
        String p1 = Teclado.nextLine();
        Personaje primerMago = Duels.verPersonaje(p1);

        elementoMagico(primerMago);

        return primerMago;
    }

    private static Personaje seleccPersonaje2() {
        System.out.println("\nIngresa el nombre del segundo jugador!\n");
        Duels.listadoPersonajes();
        String p2 = Teclado.nextLine();
        Personaje segundoMago = Duels.verPersonaje(p2);
        elementoMagico(segundoMago);

        return segundoMago;
    }

    private static void elementoMagico(Personaje perso) {
        if (perso instanceof IHacerMagia) {
            IHacerMagia magia = (IHacerMagia) perso;
            System.out.println("\nIngresa el nombre del hechizo que queres obtener!\n");
            System.out.println("\nPara elegir artefactos ingresa '666'\n");
            Duels.listadoHechizos();
            String hechizo = Teclado.nextLine();
            Hechizo h = new Hechizo();
            while (!hechizo.equals("666")) { // EL WHILE ES PARA QUE SI APRETAS 666 PASE
                h = Duels.verHechizo(hechizo);
                if (Duels.verHechizo(hechizo) != null) {
                    if (magia.getHechizo(h.nombreDeHechizo) != null) {
                        magia.aprenderHechizo(h);
                    }
                    System.out.println("\nIngresa el nombre del hechizo que queres obtener!\n");
                    System.out.println("\nPara salir ingresa '666'\n");

                    Duels.listadoHechizos();
                    hechizo = Teclado.nextLine();
                    h = new Hechizo();
                }

            }

            System.out.println("\nIngresa el nombre de los artefactos que queres obtener!\n");
            System.out.println("\nPara salir ingresa '666'\n");
            Duels.listadoArtefactos();
            String art = Teclado.nextLine();
            Artefacto a = new Artefacto();
            while (!art.equals("666")) {
                a = Duels.verArtefacto(art);
                if (Duels.verArtefacto(art) != null) {
                    if (magia.gArtefacto(a.nombreDeArtefacto) != null) {
                        magia.getArtefacto(a);
                    }
                }
                System.out.println("\nIngresa el nombre de los artefactos que queres obtener!\n");
                System.out.println("\nPara salir ingresa '666'\n");

                Duels.listadoArtefactos();
                art = Teclado.nextLine();
                a = new Artefacto();

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

 /**
  *         Personaje primerJugador = Duels.getPersonaje("Harry Potter", true, 100, 17, false, 100);
        Personaje segundoJugador = Duels.getPersonaje("Hermione Granger", true, 100, 17, false, 100);





        while (primerJugador.salud > 0 && segundoJugador.salud > 0) {


            if (primerJugador instanceof IHacerMagia) {
                IHacerMagia primerMago = (IHacerMagia) primerJugador;
                IHacerMagia segundoMago = (IHacerMagia) segundoJugador;
                primerMago.atacar(segundoJugador, ((Wizard)primerJugador).hechizos.get(0));
                segundoJugador.salud = segundoJugador.salud - 20;
                System.out.println("Harry Potter ha usado Sectumsempra! Su salud es de " + segundoJugador.salud);
                segundoMago.atacar(primerJugador, ((Wizard)segundoJugador).hechizos.get(2));
                primerJugador.salud = primerJugador.salud - 45;
                System.out.println("Hermione Granger ha usado Crucio! Su salud es de " + primerJugador.salud);
            }
        }
        }
    }
    }



  */