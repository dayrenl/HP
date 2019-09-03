package app;

import java.util.Scanner;

import app.Duels;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.personajes.Wizard;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidxs al Campeonato de Magia y Hechiceria");

        System.out.println("Inicializando catalogo de personajes ");

        Duels.inicioDuelo();

        Personaje primerJugador = new Personaje();
        primerJugador = setJugador1();
        Personaje segundoJugador = new Personaje();
        segundoJugador = setJugador2();

    }

    public static Personaje setJugador1() {
        System.out.println("ESTAS ELIGIENDO AL PRIMER JUGADOR\n");
        System.out.println("Ingresa el '1' para elegir al primer jugador!");
        System.out.println("Ingresa el '2' para aprender hechizos");
        System.out.println("Ingresa el '3' para elegir artefactos mágicos\n");
        System.out.println("Para salir ingresa '0'");
        int op = Teclado.nextInt();
        Teclado.nextLine();

        while (op <= 3) {
            switch (op) {
            case 1:
                eleccionJugador();
                break;

            case 2:
                eleccionHechizo();
                break;

            case 3:
                eleccionArtefacto();
                break;

            default:
                break;
            }
        }

        return null;

    }

    public static  Personaje eleccionJugador() {
        System.out.println("Ingresa el NOMBRE del personaje que queres que sea tu primer jugador! \n");
        Duels.listadoPersonajes();
        String p1 = Teclado.nextLine();
        Personaje primerJugador = Duels.verPersonaje(p1);
        return primerJugador;
    }

    public static void eleccionHechizo(Wizard p1){
        if (p1 instanceof Wizard){
        Wizard p = (Wizard) p1;
        System.out.println("Ingresa el NOMBRE de los hechizos que queres aprender!\n");
        Duels.listadoHechizos();
        String hech = Teclado.nextLine();
        Hechizo h = Duels.verHechizo(hech);
        System.out.println("Cuando quieras terminar de aprender ingresa '9'");
        while(!hech.equals("9")){
            if (p.getHechizo(h.nombreDeHechizo))
            p.aprenderHechizo(h);
            System.out.println("");            
        }

        }
        


        }
    }

}
