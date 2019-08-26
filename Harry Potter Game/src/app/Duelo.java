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
    public static List<Poder> poderes = new ArrayList<>();

    public List<Poder> getPoderes() {
        return poderes;
    }

    public void agregarPoderes() {

        Poder p1 = new Poder();
        p1.nombre = "Parseltongue";
        p1.nroPoder = 1;
        poderes.add(p1);

        Poder p2 = new Poder();
        p2.nombre = "Invisibilidad";
        p2.nroPoder = 2;
        poderes.add(p2);

        Poder p3 = new Poder();
        p3.nombre = "Metamorfosis";
        p3.nroPoder = 3;
        poderes.add(p3);

    }




}