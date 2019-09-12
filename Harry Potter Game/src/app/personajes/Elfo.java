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

    public Elfo(String nombre, int salud, int edad) {
        super(nombre, salud, edad);
    }

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public Poder poderInicial;

    public int energiaMagica = 100;

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

        int eneSalud = enemigo.salud;

        eneSalud = eneSalud - hechizo.nivelDanio;

            if (energiaMagica > 0) {
  
                this.energiaMagica = this.energiaMagica - hechizo.nivelEnergia;
            } else
                System.out.println("No puedes atacar, no tienes energía!");

            if (eneSalud >= 100) {
                enemigo.estaVivo = true;
            } else if (eneSalud < 1) {
                enemigo.estaVivo = false;
                enemigo.salud = 0;
                System.out.println("Hasta la vista, " + enemigo.nombre + "has perdido!");

            } else if (enemigo.estaVivo) {
                System.out.println(enemigo.nombre + " tiene " + enemigo.salud + " puntos de salud.");
            }

        }



    @Override
    public void atacar(Personaje p, String nombreHechizo) {
        }


    @Override
    public List<Artefacto> getArtefactos() {
        // TODO Auto-generated method stub
        return null;
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

    public Hechizo getHechizo(String nombre) {

        for (Hechizo h : this.hechizos) {
            if (h.nombreDeHechizo.equals(nombre)) {
                return h;
            }
        }
        return null;
    }

    /**
     * @Override public void atacar(Personaje enemigo, Hechizo hechizo) {
     * 
     *           int eneSalud = enemigo.salud; enemigo.salud = enemigo.salud - 20;
     * 
     *           if (eneSalud > 0) { enemigo.estaVivo = true; } else if (eneSalud <=
     *           1) { enemigo.estaVivo = false; System.out.println("BYE BYE " +
     *           enemigo.nombre + " sos fiambre ;)"); } else {
     *           System.out.println("No tiene energia!"); } }
     * 
     *           public Hechizo getHechizo(String nombreDeHechizo) { for (Hechizo h
     *           : this.hechizos) { if (h.nombreDeHechizo.equals(nombreDeHechizo)) {
     *           return h; } } return null; }
     * 
     * 
     * @Override public Poder getPoderInicial() { return null; }
     * 
     * @Override public void setPoderInicial(Poder poderInicial) { this.poderInicial
     *           = poderInicial;
     * 
     *           }
     * 
     * @Override public void aprenderHechizo(Hechizo h) { hechizos.add(h); }
     * 
     * @Override public void atacar(Personaje p, String nombreDeHechizo) {
     * 
     *           int eneSalud = p.salud;
     * 
     *           if (eneSalud >= 0) { p.estaVivo = true; } if (eneSalud <= 1) {
     *           p.estaVivo = false; System.out.println("BYE BYE + " + p.nombre +
     *           "sos fiambre ;)"); } else { System.out.println("No tiene
     *           energia!"); }
     * 
     *           }
     */

}