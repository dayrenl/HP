package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefacto.Artefacto;
import app.interfaces.IHacerMagia;
import app.poder.Hechizo;
import app.poder.Poder;

/**
 * Elfo
 */
public class Elfo extends Criatura implements IHacerMagia {

    public Elfo(String nombre, boolean estaVivo, int salud, int edad) {
        super(nombre, estaVivo, salud, edad);
    }

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();

    @Override
    public void atacar(Personaje p, Hechizo hechizo) {

    }

    @Override
    public void atacar(Personaje p, String nombreHechizo) {

    }

    @Override
    public List<Artefacto> getArtefactos() {
        return artefactos;
    }

    @Override
    public Poder getPoderInicial() {
        return null;
    }

    @Override
    public Poder setPoderInicial(Poder poderInicial) {
        return null;
    }

    @Override
    public void aprenderHechizo(Hechizo h) {

    }

}