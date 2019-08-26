package app;

import java.util.ArrayList;
import java.util.List;

import app.personajes.Elfo;
import app.personajes.Muggle;
import app.personajes.Personaje;
import app.personajes.Wizard;
import app.poder.Poder;

/**
 * Duelo
 */
public class Duelo {

    public static List<Personaje> catalogo = new ArrayList<Personaje>();
    public static List<Wizard> magos = new ArrayList<Wizard>();
    public static List<Elfo> elfos = new ArrayList<Elfo>();
    public static List<Muggle> muggles = new ArrayList<Muggle>();
    public static List<Poder> poderes = new ArrayList<Poder>();

   
    
    public static Poder getPoderes(String nombreDePoder) {
        for (Poder pod : Duelo.poderes) {
            if(pod.nombreDePoder.equals(nombreDePoder))
                return pod;
            
        }
        return null;

    }

    public static void IniciarPoder(){
        Duelo.agregarPoderes();
    }
    public static void agregarPoderes() {

        Poder p1 = new Poder();
        p1.nombreDePoder = "Parsel Tongue";
        p1.nroPoder = 1;
        p1.nivelEnergia = 50;
        p1.esOscuro = false;
        
        poderes.add(p1);

        Poder p2 = new Poder();
        p2.nombreDePoder = "Invisibilidad";
        p2.nroPoder = 2;
        p2.nivelEnergia = 100;
        p2.esOscuro = false;
        poderes.add(p2);

        Poder p3 = new Poder();
        p3.nombreDePoder = "Metamorfosis";
        p3.nroPoder = 3;
        p3.nivelEnergia = 35;
        p3.esOscuro = false;
        poderes.add(p3);



    }

    


}