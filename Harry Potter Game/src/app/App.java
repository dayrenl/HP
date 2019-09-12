
package app;

import java.util.Scanner;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Elfo;
import app.personajes.Muggle;
import app.personajes.Personaje;
import app.personajes.Wizard;

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

        while (primerJugador.salud  >= 1 && segundoJugador.salud >= 1) {

            
                if (primerJugador instanceof Wizard | primerJugador instanceof Elfo) {
                    dueloMagico1(primerJugador, segundoJugador);
                } else if (primerJugador instanceof Muggle) {
                    System.out.println(
                            "El primer jugador: " + primerJugador.nombre + " , es un muggle y no puede atacar");
                }
            }
                if (segundoJugador instanceof Wizard | segundoJugador instanceof Elfo) {
                    dueloMagico2(primerJugador, segundoJugador);
                } else if (segundoJugador instanceof Muggle) {
                    System.out.println(
                            "El segundo jugador: " + segundoJugador.nombre + " , es un muggle y no puede atacar");
                }
            }

        
    



    public static void dueloMagico1(Personaje primerJugador, Personaje segundoJugador) {

        if (primerJugador instanceof IHacerMagia){

        IHacerMagia mago = (IHacerMagia)primerJugador;
    
        System.out.println("\nElegi con que hechizo ataca " + primerJugador.nombre + " ingresando su nombre");
        System.out.println("Por favor, respeta las mayusculas y minusculas ");

        Duels.listadoHechizos();
        String hechizo = Teclado.nextLine();
        Hechizo h = Duels.verHechizo(hechizo);

        if (Duels.verHechizo(hechizo) != null) {
            if (Duels.getHechizo(h.nombreDeHechizo) == null) {
                mago.aprenderHechizo(h);
                System.out.println("\n// Elegiste el hechizo: " + h.nombreDeHechizo + " //");
                mago.atacar(segundoJugador, h);
            }
  
        }
    }
   

    }

    public static void dueloMagico2(Personaje primerJugador, Personaje segundoJugador) {

        
        if (segundoJugador instanceof IHacerMagia){

            IHacerMagia mago = (IHacerMagia)segundoJugador;
        
            System.out.println("\nElegi con que hechizo ataca " + segundoJugador.nombre + " ingresando su nombre");
            System.out.println("Por favor, respeta las mayusculas y minusculas ");
    
            Duels.listadoHechizos();
            String hech = Teclado.nextLine();
            Hechizo he = Duels.verHechizo(hech);
    
            if (Duels.verHechizo(hech) != null) {
                if (Duels.getHechizo(he.nombreDeHechizo) == null) {
                    mago.aprenderHechizo(he);
                    System.out.println("\n// Elegiste el hechizo: " + he.nombreDeHechizo + " //");
                    mago.atacar(primerJugador, he);
                }
            }
        }
}
}

  /**  public static Hechizo hechizoMagico(Personaje jugador){

        IHacerMagia mago = (IHacerMagia)jugador;
        String hechizo = Teclado.nextLine();
        Hechizo h = Duels.verHechizo(hechizo);

        if (Duels.verHechizo(hechizo) != null) {
            if (Duels.getHechizo(h.nombreDeHechizo) == null) {
                mago.aprenderHechizo(h);
                System.out.println("\n// Elegiste el hechizo: " + h.nombreDeHechizo + " //");
            }
        }
        return h;

    }

}
*/
/**
 * public static Hechizo elementoMagico(Personaje perso) { if (perso instanceof
 * IHacerMagia) { IHacerMagia magia = (IHacerMagia) perso;
 * System.out.println("¡Elige tu hechizo!"); System.out.println("\nIngresa el
 * nombre del hechizo que queres obtener!\n"); System.out.println("\nPor favor
 * respeta las mayusculas y minusculas\n");
 * 
 * 
 * Duels.listadoHechizos(); String hechizo = Teclado.nextLine(); Hechizo h =
 * Duels.verHechizo(hechizo);
 * 
 * if (magia.getHechizo(h.nombreDeHechizo) != null) { magia.aprenderHechizo(h);
 * }
 * 
 * return h;
 * 
 * } return null;
 * 
 * }
 * 
 * public static Artefacto artefactoMagico(Personaje perso) { if (perso
 * instanceof IHacerMagia) { IHacerMagia magia = (IHacerMagia) perso;
 * System.out.println("Elige tu artefacto"); System.out.println("\nIngresa el
 * nombre del artefacto que queres obtener!\n"); System.out.println("\nPor favor
 * respeta las mayusculas y minusculas\n");
 * 
 * 
 * Duels.listadoArtefactos(); String artefacto = Teclado.nextLine(); Artefacto
 * arte = Duels.verArtefacto(artefacto);
 * 
 * if (magia.getArtefacto() != null) { System.out.println("El artefacto escogido
 * es " + arte); }
 * 
 * return arte;
 * 
 * } return null;
 * 
 * }
 * 
 * public static void juegoFull(Personaje primerJugador, Personaje
 * segundoJugador) { IHacerMagia magia;
 * 
 * Hechizo h = new Hechizo(); Hechizo hechi = new Hechizo();
 * 
 * 
 * 
 * magia = (IHacerMagia) primerJugador; while (primerJugador.salud > 0 &&
 * segundoJugador.salud > 0) { if (primerJugador instanceof IHacerMagia &&
 * segundoJugador instanceof IHacerMagia) {
 * System.out.println(primerJugador.nombre + " ataca a " +
 * segundoJugador.nombre); magia.atacar(segundoJugador, h);
 * System.out.println("La salud del segundo jugador es: " +
 * segundoJugador.salud); System.out.println(segundoJugador.nombre + " ataca a "
 * + primerJugador.nombre); magia.atacar(primerJugador, hechi);
 * System.out.println("La salud del primer jugador es " + primerJugador.salud);
 * 
 * } else { System.out.println("Un jugado no tiene magia"); }
 * 
 * } }
 */
