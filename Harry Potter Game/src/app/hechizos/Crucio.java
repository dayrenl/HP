package app.hechizos;

/**
 * Crucio
 */
public class Crucio extends HechizoAtaque{

   

    public Crucio(){
        
    }

    public Crucio(String nombreDeHechizo, boolean esOscuro, int nivelDanio, int nivelCuracion,
            int nivelEnergia) {
        super(nombreDeHechizo, esOscuro, nivelDanio, nivelCuracion, nivelEnergia);
    }

    
}