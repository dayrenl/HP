package app.hechizos;
import java.util.ArrayList;
import java.util.List;

import app.poderes.Poder;

/**
 * Hechizo
 */
public class Hechizo extends Poder {

    
    public String nombreDeHechizo;

    public boolean esOscuro;

    public int nivelDanio;
    public int nivelCuracion;
    public int nivelEnergia;

    public static List<Hechizo> hechizos = new ArrayList<>();

    public Hechizo (String nombreDeHechizo, boolean esOscuro, int nivelDanio, int nivelCuracion, int nivelEnergia){
        this.nombreDeHechizo = nombreDeHechizo;
        this.esOscuro = esOscuro;
        this.nivelDanio = nivelDanio;
        this.nivelCuracion = nivelCuracion;
        this.nivelEnergia = nivelEnergia;
    }

    public Hechizo(){

    }

    



}