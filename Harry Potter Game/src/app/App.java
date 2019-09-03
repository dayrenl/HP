package app;

import java.util.Scanner;

import app.Duels;
import app.hechizos.Hechizo;
import app.personajes.Persona;
import app.personajes.Personaje;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidxs al Campeonato de Magia y Hechiceria");

        System.out.println("Inicializando catalogo de personajes ");

        Duels.inicioDuelo();

        Personaje primerJugador = new Personaje();
        primerJugador = setJugadores();
        Personaje segundoJugador = new Personaje();
        segundoJugador = setJugadores();

    }

    public static Personaje setJugadores() {

        System.out.println("Ingresa el '1' para elegir al primer jugador!");
        System.out.println("Ingresa el '2' para elegir al segundo jugador! \n");
        System.out.println("Para salir ingresa '9'");
        int op = Teclado.nextInt();
        Teclado.nextLine();

        while (op <= 2) {
            switch (op) {
            case 1:
                System.out.println("ESTAS ELIGIENDO AL PRIMER JUGADOR\n");
                setJugador1();
                break;

            case 2:
                System.out.println("ESTAS ELIGIENDO AL SEGUNDO JUGADOR\n");
                setJugador2();
                break;

            default:
                break;
            }
        }

        return null;

    }

    public static  Personaje setJugador2() {

 System.out.println("Ingresa el nombre del personaje que queres que sea tu primer jugador!");
            Duels.listadoPersonajes();

            String primerMago = Teclado.nextLine();
            Personaje p1 = Duels.verPersonaje(primerMago);

            if (p1 instanceof Persona){
                Persona per = (Persona) p1;
                System.out.println("Ingresa los nombres de los hechizos que queres aprender para pasar a 'ARTEFACTOS', ingresa '9' \n");
                Duels.listadoHechizos();

                String hech = Teclado.nextLine();
                Hechizo h = Duels.verHechizo(hech);

                while (!hech.equals("9")) {
                    if(per.estaVivo) {
                        per.aprenderHechizo(h);
                    } 
                        System.out.println("Ingresa los nombres de los hechizos que queres aprender para pasar a 'ARTEFACTOS', ingresa '9' \n");
                       hech = Teclado.nextLine(); 
                    
                }


                System.out.println("Ingresa el nombre de los artefactos que queres obtener! \n");
                Duels.listadoArtefactos();
                String art = Teclado.nextLine();


                while (!art.equals("9")) {

                    if (per.estaVivo){
                        per.getArtefacto();

                    }
                    System.out.println("Ingresa el nombre de los artefactos que deseas obtener");
                    Duels.listadoArtefactos();
                    art = Teclado.nextLine();
                    
                }
           
            }
        return p1;
            

    }

    public static Personaje setJugador1() {
            System.out.println("Ingresa el nombre del personaje que queres que sea tu primer jugador!");
            Duels.listadoPersonajes();

            String primerMago = Teclado.nextLine();
            Personaje p1 = Duels.verPersonaje(primerMago);

            if (p1 instanceof Persona){
                Persona per = (Persona) p1;
                System.out.println("Ingresa los nombres de los hechizos que queres aprender para pasar a 'ARTEFACTOS', ingresa '9' \n");
                Duels.listadoHechizos();

                String hech = Teclado.nextLine();
                Hechizo h = Duels.verHechizo(hech);

                while (!hech.equals("9")) {
                    if(per.estaVivo) {
                        per.aprenderHechizo(h);
                    } 
                        System.out.println("Ingresa los nombres de los hechizos que queres aprender para pasar a 'ARTEFACTOS', ingresa '9' \n");
                       hech = Teclado.nextLine(); 
                    
                }


                System.out.println("Ingresa el nombre de los artefactos que queres obtener! \n");
                Duels.listadoArtefactos();
                String art = Teclado.nextLine();


                while (!art.equals("9")) {

                    if (per.estaVivo){
                        per.getArtefacto();

                    }
                    System.out.println("Ingresa el nombre de los artefactos que deseas obtener");
                    Duels.listadoArtefactos();
                    art = Teclado.nextLine();
                    
                }
           
            }
        return p1;
            


    }
}

    
/**
	public static Personaje eleccionJugador() {
        System.out.println("Ingresa el NOMBRE del personaje que queres que sea tu primer jugador! \n");
        Duels.listadoPersonajes();
        String p1 = Teclado.nextLine();
        Personaje primerJugador = Duels.verPersonaje(p1);
        return primerJugador;
    }

    public static void eleccionHechizo(Wizard p1) {
        if (p1 instanceof Wizard) {
            Wizard p = (Wizard) p1;
            System.out.println("Ingresa el NOMBRE de los hechizos que queres aprender!\n");
            Duels.listadoHechizos();
            String hech = Teclado.nextLine();
            Hechizo h = Duels.verHechizo(hech);
            System.out.println("Cuando quieras terminar de aprender ingresa '9'");
            while (!hech.equals("9")) {
                if (p.getHechizo(h.nombreDeHechizo))
                    p.aprenderHechizo(h);
                System.out.println("");
            }

        }

    }
}

}

*/