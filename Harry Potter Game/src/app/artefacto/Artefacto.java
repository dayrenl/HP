package app.artefacto;

import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.poder.Hechizo;
import app.poder.Poder;

/**
 * Artefacto
 */
public class Artefacto implements IHacerMagia {

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