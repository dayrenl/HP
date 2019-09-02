package app;

import java.util.Scanner;

import app.Duels;
import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidxs al Campeonato de Magia y Hechiceria");

        System.out.println("Inicializando catalogo de personajes ");

        Duels.inicioDuelo();

        Personaje primerJugador = Duels.verPersonaje();
        primerJugador = setJugador(primerJugador);
        Personaje segundoJugador = Duels.verPersonaje();
        //segundoJugador = setJugador2();

    }
/**while  para que elija una opcion despues un switch y un while de nuevo */
 
    
    /** public static Personaje setJugador() {
        System.out.println("ESTAS ELIGIENDO AL PRIMER JUGADOR\n");

        System.out.println("Ingresa el nombre del personaje que sera el primer jugador");
        Duels.listadoPersonajes();
        String perso1 = Teclado.nextLine();
        Personaje primerJugador = Duels.verPersonaje(perso1); //metemos string?

        if (primerJugador instanceof IHacerMagia){
            IHacerMagia primerMago = (IHacerMagia) primerJugador;
            System.out.println("Ingresa el nombre de los hechizos que quieras aprender! Presiona '666' para elegir Artefactos");
            Duels.listadoHechizos();
            String hech = Teclado.nextLine();

            while (hech != "666"){
                Hechizo h = Duels.verHechizo(hech);
                if (primerMago.getHechizo(h.nombreDeHechizo) == null); {
                    primerMago.aprenderHechizo(h);
                }
            }




        


    
    }


/**
 * Personaje primerJugador = Duels.getPersonaje("Harry Potter", true, 100, 17,
 * false, 100); Personaje segundoJugador = Duels.getPersonaje("Hermione
 * Granger", true, 100, 17, false, 100);
 * 
 * 
 * 
 * 
 * while (primerJugador.salud > 0 && segundoJugador.salud > 0) {
 * 
 * if (primerJugador instanceof IHacerMagia) { IHacerMagia primerMago =
 * (IHacerMagia) primerJugador; IHacerMagia segundoMago = (IHacerMagia)
 * segundoJugador; primerMago.atacar(segundoJugador,
 * ((Wizard)primerJugador).hechizos.get(0)); segundoJugador.salud =
 * segundoJugador.salud - 20; System.out.println("Harry Potter ha usado
 * Sectumsempra! Su salud es de " + segundoJugador.salud);
 * segundoMago.atacar(primerJugador, ((Wizard)segundoJugador).hechizos.get(2));
 * primerJugador.salud = primerJugador.salud - 45; System.out.println("Hermione
 * Granger ha usado Crucio! Su salud es de " + primerJugador.salud); } }
 */
