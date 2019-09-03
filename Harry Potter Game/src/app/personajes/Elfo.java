package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.poderes.Poder;

/**
 * Elfo
 */
public class Elfo extends Criatura implements IHacerMagia {

    public Elfo(String nombre, boolean estaVivo, int salud, int edad) {
        super(nombre, estaVivo, salud, edad);
    }

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public Poder poderInicial;

    @Override
    public void atacar(Personaje p, Hechizo hechizo) {

        int eneSalud = p.salud;
        int danio = hechizo.nivelDanio;
        int curacion = 0;
        int curacionTotal;

        curacionTotal = eneSalud + curacion;

        p.salud = curacionTotal - danio;

        if (p.salud >= 100) {
            p.estaVivo = true;
            p.salud = 100;
        } else if (p.salud < 1) {
            p.estaVivo = false;
            p.salud = 0;
        } else {
            System.out.println("No tiene energia!");
        }

    }

    @Override
    public void atacar(Personaje p, String nombreHechizo) {

        Hechizo h = getHechizo(nombreHechizo);
        int eneSalud = p.salud;
        int danio = h.nivelDanio;
        int danio2 = 0;
        int curacion = 0;

        int danioTotal;

        int curacionTotal;

        danioTotal = danio + danio2;
        curacionTotal = eneSalud + curacion;
        p.salud = (int) (curacionTotal - danioTotal);

        if (p.salud > 1 && p.salud < 100) {
            p.salud = 100;
            p.estaVivo = true;
        }

        if (p.salud < 1) {
            p.estaVivo = false;
            p.salud = 0;
        } else {
            System.out.println("No tiene energia!");
        }

    }

    private Hechizo getHechizo(String nombreHechizo) {
        return null;
    }

    @Override
    public List<Artefacto> getArtefacto() {
        return null;
    }

    @Override
    public Poder getPoderInicial() {
        return null;
    }

    @Override
    public void setPoderInicial(Poder poderInicial) {
        this.poderInicial = poderInicial;

    }

    @Override
    public void aprenderHechizo(Hechizo h) {
        hechizos.add(h);
    }

}