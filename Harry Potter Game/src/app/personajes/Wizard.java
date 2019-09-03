package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.poderes.Poder;
import app.transporte.Escoba;

public class Wizard extends Personaje implements IHacerMagia {

    public Wizard(String nombre, boolean estaVivo, int salud, int edad) {
        super(nombre, estaVivo, salud, edad);

    }

    public Escoba escoba;
    public Poder poderInicial;
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public static boolean magoOscuro;
    public int energiaMagica;
    public Artefacto artefacto;

    public static List<Wizard> wizards = new ArrayList<Wizard>();

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    @Override
    public void atacar(Personaje p, String nombreHechizo) {

    }

    public Artefacto getArtefacto(String nombreDeArtefacto) {
        for (Artefacto a : this.artefactos) {
            if (a.nombreDeArtefacto.equals(nombreDeArtefacto)) {
                return a;
            }
        }
        return null;
    }

    public Artefacto setArtefacto(Artefacto artefacto) {
        return artefacto;

    }

    @Override
    public Poder getPoderInicial() {
        return poderInicial;
    }

    @Override
    public void setPoderInicial(Poder poderInicial) {
        this.poderInicial = poderInicial;

    }

    @Override
    public void aprenderHechizo(Hechizo h) {
        this.hechizos.add(h);
    }

    public Hechizo getHechizo(String nombreDeHechizo) {
        for (Hechizo h : this.hechizos) {
            if (h.nombreDeHechizo.equals(nombreDeHechizo)) {
                return h;
            }
        }
        return null;
    }

    @Override
    public Artefacto getArtefacto() {
        return null;
    }
}