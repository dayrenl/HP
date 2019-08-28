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

    public static void aprenderHechizo(){
        Hechizo.agregarHechizo();
    }

    public static List<Hechizo> agregarHechizo() {

        Hechizo hech = new Hechizo();
        hech.nombreDeHechizo = "Sectum Sempra";
        hech.nroDeHechizo = 1;
        hech.esOscuro = true;
        hech.nivelCuracion = 35;
        hech.nivelDanio = 100;
        hechizos.add(hech);

        hech = new Hechizo();
        hech.nombreDeHechizo = "Vulnera Sanentur";
        hech.nroDeHechizo = 2;
        hech.esOscuro = false;
        hech.nivelCuracion = 100;
        hech.nivelDanio = 100;
        hechizos.add(hech);

        hech = new Hechizo();
        hech.nombreDeHechizo = "Wingardium Leviosa";
        hech.nroDeHechizo = 3;
        hech.esOscuro = false;
        hech.nivelCuracion = 0;
        hech.nivelDanio = 50;
        hechizos.add(hech);

        hech = new Hechizo();
        hech.nombreDeHechizo = "Cave Inimicum";
        hech.nroDeHechizo = 4;
        hech.esOscuro = false;
        hech.nivelCuracion = 0;
        hech.nivelDanio = 0;
        hechizos.add(hech);

        hech = new Hechizo();
        hech.nombreDeHechizo = "Avada Kedavra";
        hech.nroDeHechizo = 5;
        hech.esOscuro = true;
        hech.nivelCuracion = 0;
        hech.nivelDanio = 100;
        hechizos.add(hech);

        hech = new Hechizo();
        hech.nombreDeHechizo = "Crucio";
        hech.nroDeHechizo = 6;
        hech.esOscuro = true;
        hech.nivelCuracion = 0;
        hech.nivelDanio = 100;
        hechizos.add(hech);

        return hechizos;


    }
    public static Hechizo selecHechizos(String nombreDeHechizo) {
        for(Hechizo hech : Hechizo.hechizos) {
            if (hech.nombreDeHechizo.equals(nombreDeHechizo))
                return hech;
        }
        return null;
    }
    /**
     * public static Hechizzo selecHechizos(int nroHechizo) {
        for(Hechizzo hech : Hechizzo.hechizos) {
            if (hech.nroHechizo == nroHechizo)
                return hech;
        }
        return null;
    }
     */





}