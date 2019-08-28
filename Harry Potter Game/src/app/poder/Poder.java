package app.poder;

import java.util.ArrayList;
import java.util.List;

/**
 * Poder
 */
public class Poder {
    public String nombreDePoder;
    public int nroPoder;

    public boolean esOscuro; // cambia a wizardoOscuro a true
    public int nivelDanio;
    public int nivelCuracion;
    public int nivelEnergia;

    public static List<Poder> poderes = new ArrayList<Poder>();

    public Poder(String nombreDePoder, int nroPoder, boolean esOscuro, int nivelDanio, int nivelCuracion,
            int nivelEnergia) {
        this.nombreDePoder = nombreDePoder;
        this.nroPoder = nroPoder;
        this.esOscuro = esOscuro;
        this.nivelDanio = nivelDanio;
        this.nivelCuracion = nivelCuracion;
        this.nivelEnergia = nivelEnergia;
    
    }

    public Poder() {

    }

    
}