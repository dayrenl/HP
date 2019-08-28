package app.personajes;

import java.util.List;
import java.util.ArrayList;

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

    public static List<Elfo> elfo = new ArrayList<>();

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    @Override
    public void atacar(Personaje enemigo, String nombreHechizo) {

    }

    @Override
    public Artefacto getArtefactos() {
        return null;
    }

    @Override
    public Poder getPoderInicial(Poder poder) {
        return null;
    }

    @Override
    public Poder setPoderInicial(Poder poder) {
        return null;
    }

    @Override
    public void aprenderHechizo(Hechizo hechizo) {

    }

}