package app.personajes;

import java.util.ArrayList;
import java.util.List;
import app.poder.Hechizo;
import app.poder.Poder;
import app.artefacto.Artefacto;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;

public class Wizard extends Personaje implements IHacerMagia {

    public Wizard(String nombre, boolean estaVivo, int salud, int edad) {
        super(nombre, estaVivo, salud, edad);
    }

    public Wizard(String nombre, boolean estaVivo, int salud, int edad) {
	}

	public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();

    public static List<Wizard> magos = new ArrayList<Wizard>();

    

    
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