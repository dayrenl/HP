package app;

import app.personajes.Personaje;
import app.personajes.Wizard;
import app.poder.CaveInimicum;
import app.poder.Hechizo;
import app.poder.Poder;
import app.poder.Sectumsempra;
import app.Duels;
import app.artefacto.Artefacto;
import app.interfaces.IHacerMagia;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidxs al Campeonato de Magia y Hechiceria");

        System.out.println("Inicializando catalogo de personajes ");
        Duels.inicioDuelo();

        Personaje primerJugador = Duels.getPersonaje("Harry Potter", true, 100, 17, false, 90);
        Personaje segundoJugador = Duels.getPersonaje("Hermione Granger", true, 100, 17, false, 100);
       
        while (primerJugador.salud > 0 && segundoJugador.salud > 0) {
            
        }
    }

}
