package app;

import app.personajes.Personaje;
import app.personajes.Wizard;
import app.Duels;
import app.interfaces.IHacerMagia;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidxs al Campeonato de Magia y Hechiceria");

        System.out.println("Inicializando catalogo de personajes ");
        Duels.inicioDuelo();
        

        Personaje primerJugador = Duels.getPersonaje("Harry Potter", true, 100, 17, false, 100);
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
