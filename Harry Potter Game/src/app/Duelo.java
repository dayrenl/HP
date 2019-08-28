package app;

import java.util.ArrayList;
import java.util.List;

import app.artefacto.Artefacto;
import app.personajes.Elfo;
import app.personajes.Muggle;
import app.personajes.Personaje;
import app.personajes.Wizard;
import app.poder.Hechizo;
import app.poder.Poder;

/**
 * Duelo
 */
public class Duelo {

    public static List<Personaje> catalogo = new ArrayList<Personaje>();

    public static List<Artefacto> artefactos = new ArrayList<>();
/**
    public static List<Artefacto> listArtefac() {

        Artefacto artef = new Artefacto();
        artef.nombreArtefacto = "Capa de Invisibilidad";
        artef.amplificadorDeSalud = 10;
        artef.amplificadorDeSalud = 10;
        artefactos.add(artef);

        artef = new Artefacto();
        artef.nombreArtefacto = "Piedra Resurreccion";
        artef.amplificadorDeSalud = 10;
        artef.amplificadorDeSalud = 10;
        artefactos.add(artef);

        artef = new Artefacto();
        artef.nombreArtefacto = "Horrocrux";
        artef.amplificadorDeSalud = 10;
        artef.amplificadorDeSalud = 10;
        artefactos.add(artef);

        artef = new Artefacto();
        artef.nombreArtefacto = "Varita de Sauco";
        artef.amplificadorDeSalud = 10;
        artef.amplificadorDeSalud = 10;
        artefactos.add(artef);

        return artefactos;

    }

    public static List<Poder> poderes = new ArrayList<Poder>();

    public static void aprenderPoder() {
        Duelo.agregarPoderes();
    }

    public static List<Poder> agregarPoderes() {

        Poder pod = new Poder();
        pod.nombreDePoder = "Parsel Tongue";
        pod.nroPoder = 1;
        pod.esOscuro = false;
        pod.nivelCuracion = 0;
        pod.nivelDanio = 50;
        pod.nivelEnergia = 50;
        poderes.add(pod);

        pod = new Poder();
        pod.nombreDePoder = "Invisibilidad";
        pod.nroPoder = 2;
        pod.esOscuro = false;
        pod.nivelCuracion = 0;
        pod.nivelDanio = 50;
        pod.nivelEnergia = 50;

        pod = new Poder();
        pod.nombreDePoder = "Metamorfosis";
        pod.nroPoder = 3;
        pod.esOscuro = false;
        pod.nivelCuracion = 0;
        pod.nivelDanio = 50;
        pod.nivelEnergia = 50;

        return poderes;

    }

    public static Poder selecPoder(int nroPoder) {
        for (Poder pod : Poder.poderes) {
            if (pod.nroPoder == nroPoder)
                return pod;
        }
        return null;
    }

    /**
     * public static Poder selecPoder(String nombreDePoder){ for (Poder pod :
     * Poder.poderes){ if (pod.nombreDePoder.equals(nombreDePoder)) return pod; }
     * return null; }
     */

    public static List<Wizard> magos = new ArrayList<Wizard>();

    public static List<Wizard> ListMago() {

        Wizard mago = new Wizard("Harry Potter", true, 100, 17);
        mago.Artefacto = new Artefacto(2, 2, "Capa de Invisibilidad");
        mago.hechizos = new Hechizo(1, "Sectum Sempra", true, nivelDanio, nivelCuracion, nivelEnergia)
        mago.add(mago);

        Wizard mago1 = new Wizard("Hermione Granger", true, 100, 17);
        magos.add(mago1);

        Wizard mago2 = new Wizard("Ron Weasley", true, 70, 17);
        mago.add(mago2);

        Wizard mago3 = new Wizard("Draco Malfoy", true, 100, 17);
        mago.add(mago3);

        Wizard mago4 = new Wizard("Severus Snape", true, 100, 45);
        magos.add(mago4);

        mag = new Wizard();
        mag.nombreDeMago = "Dolores Umbridge";
        mag.edad = 50;
        magos.add(mag);

        mag = new Wizard();
        mag.nombreDeMago = "Bellatrix Lestrange";
        mag.edad = 45;
        magos.add(mag);

        mag = new Wizard();
        mag.nombreDeMago = "Albus Dumbledore";
        mag.edad = 70;
        magos.add(mag);

        mag = new Wizard();
        mag.nombreDeMago = "Minerva McGonagall";
        mag.edad = 70;
        magos.add(mag);

        return magos;

    }

    public static List<Elfo> elfos = new ArrayList<Elfo>();

    public static List<Elfo> listElfo() {

        Elfo elf = new Elfo();
        elf.nombreDeElfo = "Dobby";
        elf.salud = 85;
        elfos.add(elf);

        elf = new Elfo();
        elf.nombreDeElfo = "Kreacher";
        elf.salud = 90;
        elfos.add(elf);

        return elfos;

    }

    public static List<Muggle> muggles = new ArrayList<Muggle>();

    public static List<Muggle> listMuggle() {
        Muggle mugg = new Muggle();
        mugg.nombreMuggle = "Dudley Dursley";
        mugg.edad = 17;

        muggles.add(mugg);

        mugg = new Muggle();
        mugg.nombreMuggle = "Vernon Dursley";
        mugg.edad = 45;
        muggles.add(mugg);

        mugg = new Muggle();
        mugg.nombreMuggle = "Petunia Potter";
        mugg.edad = 45;
        muggles.add(mugg);

        return muggles;

    }

}
