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

    public String getNombreDeHechizo() {
        return nombreDeHechizo;
    }

    public void setNombreDeHechizo(String nombreDeHechizo) {
        this.nombreDeHechizo = nombreDeHechizo;
    }

    public boolean isEsOscuro() {
        return esOscuro;
    }

    public void setEsOscuro(boolean esOscuro) {
        this.esOscuro = esOscuro;
    }

    public int getNivelDanio() {
        return nivelDanio;
    }

    public void setNivelDanio(int nivelDanio) {
        this.nivelDanio = nivelDanio;
    }

    public int getNivelCuracion() {
        return nivelCuracion;
    }

    public void setNivelCuracion(int nivelCuracion) {
        this.nivelCuracion = nivelCuracion;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public static List<Hechizo> getHechizos() {
        return hechizos;
    }

    public static void setHechizos(List<Hechizo> hechizos) {
        Hechizo.hechizos = hechizos;
    }

    



}