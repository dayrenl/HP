package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.IHacerMagia;
import app.poder.Hechizo;
import app.poder.Poder;
import app.transporte.Escoba;

public class Wizard<Artefacto> extends Personaje implements IHacerMagia {

    public Wizard(String nombre, boolean estaVivo, int salud, int edad) {
        super(nombre, estaVivo, salud, edad);
    }


    public Escoba escoba;
    public Poder poderInicial;
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public boolean magoOscuro; //¿?
    public int energiaMagica;

    @Override
    public void atacar(Personaje p, Hechizo hechizo) {

    } //ENEMIGOS

    @Override
    public void atacar(Personaje p, String nombreHechizo) {

    }

    @Override
    public List<app.artefacto.Artefacto> getArtefactos() {
        return null;
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