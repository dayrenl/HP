package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefacto.Artefacto;
import app.interfaces.IHacerMagia;
import app.poder.Hechizo;
import app.poder.Poder;
import app.transporte.Escoba;

public class Wizard extends Personaje implements IHacerMagia {

   


    public Wizard(String nombre, boolean estaVivo, int salud, int edad, boolean magoOscuro, int energiaMagica) {
        super(nombre, estaVivo, salud, edad, magoOscuro, energiaMagica);
    
    }

    public Escoba escoba;
    public Poder poderInicial;
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public boolean magoOscuro; //¿?
    public int energiaMagica;
    public Artefacto artefacto;

    public static List<Wizard> wizards = new ArrayList<Wizard>();

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    @Override
    public void atacar(Personaje p, String nombreHechizo) {

    }

    @Override
    public Artefacto getArtefacto() {
        return null;
    }
    public Artefacto setArtefacto(Artefacto artefacto){
        return artefacto;

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

    }

    
	

}