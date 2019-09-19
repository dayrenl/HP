
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

        Personaje primerJugador = seleccPersonaje();
        Personaje segundoJugador = seleccPersonaje();

        juegoFull(primerJugador, segundoJugador);

    }

    public static Personaje seleccPersonaje() {

        System.out.println("\nIngresa el nombre de tu jugador!\n");
        System.out.println("Por favor, respeta las mayusculas y minusculas\n");
        Duels.listadoPersonajes();
        String p1 = Teclado.nextLine();
        Personaje mago = Duels.verPersonaje(p1);
        System.out.println("// El jugador elegido es: " + mago.nombre + " //");
        artefactoMagico(mago);
        // hechizoMagico(mago1);

        return mago;
    }

    /**
     * public static Hechizo hechizoMagico(Personaje person) {
     * 
     * if (person instanceof IHacerMagia) { IHacerMagia mago = (IHacerMagia) person;
     * 
     * System.out.println("Elige tu hechizo!"); System.out.println("\nIngresa el
     * nombre del hechizo que deseas obtener\n"); System.out.println("Por favor,
     * respeta las mayusculas y minusculas ");
     * 
     * Duels.listadoHechizos(); String hechizo = Teclado.nextLine(); Hechizo h =
     * Duels.verHechizo(hechizo);
     * 
     * if (Duels.verHechizo(hechizo) != null) { if
     * (Duels.getHechizo(h.nombreDeHechizo) == null) { mago.aprenderHechizo(h);
     * System.out.println("// Elegiste el hechizo: " + h.nombreDeHechizo + " //");
     * return h; } }
     * 
     * } return null; }
     */
    public static Artefacto artefactoMagico(Personaje person) {
        if (person instanceof IHacerMagia) {
            IHacerMagia mago = (IHacerMagia) person;
            System.out.println("Elige tu artefacto!");
            System.out.println("\nIngresa el nombre del artefacto que deseas obtener\n");
            System.out.println("Por favor, respeta las mayusculas y minusculas ");

            Duels.listadoArtefactos();
            String artefacto = Teclado.nextLine();
            Artefacto a = Duels.verArtefacto(artefacto);

            if (Duels.verArtefacto(artefacto) != null) {
                if (Duels.verArtefacto(a.nombreDeArtefacto) == null) {
                    mago.getArtefactos();
                    System.out.println("// Elegiste el artefacto : " + a.nombreDeArtefacto + " //");
                    return a;

                }
            }

        }
        return null;

    }

    /*
     * public static void dueloFull(Personaje primerJugador, Personaje
     * segundoJugador) { IHacerMagia mago1 = (IHacerMagia) primerJugador;
     * IHacerMagia mago2 = (IHacerMagia) segundoJugador;
     * 
     * while (primerJugador.isEstaVivo() && segundoJugador.isEstaVivo()) {
     * 
     * for (int i = 0; i < ABM.Personas.size(); i++) {
     * System.out.println(ABM.Personas.get(i)); } }
     * 
     * if (primerJugador instanceof IHacerMagia) {
     * System.out.println("El primer jugador: " + primerJugador.nombre +
     * " atacara a " + segundoJugador.nombre );
     * 
     * //FALTA LLAMAR AL HECHIZO QUE ELIGE EL USUARIO
     * 
     * if (primerJugador.getHechizo(nombreDeHechizo) != null) {
     * System.out.println(primerJugador.nombre + "ataca a " + segundoJugador.nombre
     * + " invoca el hechizo : " +
     * primerJugador.getHechizo("hechi").nombreDeHechizo);
     * mago1.atacar(segundoJugador, primerJugador.getHechizo(hechi)); } else {
     * System.out.println(" El jugador " + primerJugador.nombre +
     * " no puede atacar porque esta muerto"); } } if (segundoJugador instanceof
     * IHacerMagia) {
     * 
     * 
     * if (segundoJugador.estaVivo) { System.out.println("El segundo jugador: " +
     * segundoJugador.nombre + " atacara a " + primerJugador.nombre ); //FALTA
     * LLAMAR AL HECHIZO QUE ELEGE EL USUARIO
     * 
     * if (segundoJugador.getHechizo(hechi) != null) {
     * System.out.println(segundoJugador.nombre + "ataca a " + primerJugador.nombre
     * + " invoca el hechizo : " +
     * segundoJugador.getHechizo(hechi).nombreDeHechizo);
     * mago2.atacar(segundoJugador, segundoJugador.getHechizo(hechi)); } else {
     * System.out.println( " El jugador " + segundoJugador.nombre +
     * " no puede atacar porque esta muerto");
     * 
     * }
     * 
     * } } }
     * 
     */

    public static void juegoFull(Personaje primerJugador, Personaje segundoJugador) {

        while (primerJugador.salud >= 1 && segundoJugador.salud >= 1) {
    
    
            IHacerMagia mago = (IHacerMagia)primerJugador;
            IHacerMagia mago2 = (IHacerMagia) segundoJugador;

            if (primerJugador instanceof IHacerMagia) {
                System.out.println("\nElegi con que hechizo ataca " + primerJugador.nombre + " ingresando su nombre");
                System.out.println("Por favor, respeta las mayusculas y minusculas ");

                Duels.listadoHechizos();
                String hechizo = Teclado.nextLine();
                Hechizo h = Duels.verHechizo(hechizo);

                if (Duels.verHechizo(hechizo) != null) {
                    if (Duels.verHechizo(h.nombreDeHechizo) == null) {
                        mago.aprenderHechizo(h);
                        System.out.println("\n// Elegiste el hechizo: " + h.nombreDeHechizo + " //");
                       
                        
                    }
                }
                mago.atacar(segundoJugador, h);
                System.out.println("La salud de " + segundoJugador.nombre + " es " + segundoJugador.salud);

            }

            if (segundoJugador instanceof IHacerMagia && segundoJugador.salud >= 1) {

                System.out.println("\nElegi con que hechizo ataca " + segundoJugador.nombre + " ingresando su nombre");
                System.out.println("Por favor, respeta las mayusculas y minusculas ");

                Duels.listadoHechizos();
                String hech = Teclado.nextLine();
                Hechizo he = Duels.verHechizo(hech);

                if (Duels.verHechizo(hech) != null) {
                    if (Duels.verHechizo(he.nombreDeHechizo) == null) {
                        mago2.aprenderHechizo(he);
                        System.out.println("\n// Elegiste el hechizo: " + he.nombreDeHechizo + " //");
                       
                    }
                }
                mago2.atacar(primerJugador, he);
                System.out.println("La salud de " + primerJugador.nombre + " es " + primerJugador.salud);
            }
            
        }


        
    }
}


