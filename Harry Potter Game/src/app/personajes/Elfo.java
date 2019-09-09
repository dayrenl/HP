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
    public void atacar(Personaje enemigo, Hechizo hechizo) {
        
        int eneSalud = enemigo.salud;

        eneSalud = eneSalud - hechizo.nivelDanio;
        

    }

    @Override
    public void atacar(Personaje p, String nombreHechizo) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Artefacto> getArtefactos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Poder getPoderInicial() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setPoderInicial(Poder poderInicial) {
        // TODO Auto-generated method stub

    }

    @Override
    public void aprenderHechizo(Hechizo h) {
        hechizos.add(h);

    }

    /** 
    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

        int eneSalud = enemigo.salud;
        enemigo.salud = enemigo.salud - 20;

        if (eneSalud > 0) {
            enemigo.estaVivo = true;
        } else if (eneSalud <= 1) {
            enemigo.estaVivo = false;
            System.out.println("BYE BYE " + enemigo.nombre + " sos fiambre ;)");
        } else {
            System.out.println("No tiene energia!");
        }
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

    @Override
    public void atacar(Personaje p, String nombreDeHechizo) {

        int eneSalud = p.salud;

        if (eneSalud >= 0) {
            p.estaVivo = true;
        }
        if (eneSalud <= 1) {
            p.estaVivo = false;
            System.out.println("BYE BYE + " + p.nombre + "sos fiambre ;)");
        } else {
            System.out.println("No tiene energia!");
        }

    } */

    
}