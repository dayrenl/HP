package app.hechizos;

/**
 * Sectumsempra
 */
public class Sectumsempra extends HechizoAtaque{


    public Sectumsempra(){
        
    }

    public Sectumsempra( String nombreDeHechizo, boolean esOscuro, int nivelDanio, int nivelCuracion,
            int nivelEnergia) {
        super(nombreDeHechizo, esOscuro, nivelDanio, nivelCuracion, nivelEnergia);
    }
}