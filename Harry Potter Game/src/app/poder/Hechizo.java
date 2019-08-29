package app.poder;

import java.util.ArrayList;
import java.util.List;

/**
 * Hechizzo
 */
public class Hechizo {

    public int nroDeHechizo;
    public String nombreDeHechizo;

    public boolean esOscuro;

    public int nivelDanio;
    public int nivelCuracion;
    public int nivelEnergia;

    public static List<Hechizo> hechizos = new ArrayList<>();

    public Hechizo (int nroDeHechizo, String nombreDeHechizo, boolean esOscuro, int nivelDanio, int nivelCuracion, int nivelEnergia){
        this.nroDeHechizo = nroDeHechizo;
        this.nombreDeHechizo = nombreDeHechizo;
        this.esOscuro = esOscuro;
        this.nivelDanio = nivelDanio;
        this.nivelCuracion = nivelCuracion;
        this.nivelEnergia = nivelEnergia;
    }

    public Hechizo(){

    }

    



}