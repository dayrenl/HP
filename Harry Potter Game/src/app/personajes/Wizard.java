package app.personajes;

import java.util.ArrayList;
import java.util.List;
import app.poder.Hechizo;
import app.poder.Poder;
import app.artefacto.Artefacto;
import app.interfaces.IHacerMagia;



public class Wizard extends Personaje implements IHacerMagia {

    public int energiaMagica;

    List<Hechizo> hechizos = new ArrayList<Hechizo>();
    List<Artefacto> artefactos = new ArrayList<Artefacto>();

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