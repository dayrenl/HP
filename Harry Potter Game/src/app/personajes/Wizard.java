package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.poderes.Poder;
import app.transporte.Escoba;

public class Wizard extends Personaje implements IHacerMagia {

    public Wizard(String nombre, boolean estaVivo, int salud, int edad) {
        super(nombre, estaVivo, salud, edad);

    }

    public Escoba escoba;
    public Poder poderInicial;
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public boolean magoOscuro; // ¿?
    public int energiaMagica = 100;
    public static List<Wizard> wizards = new ArrayList<Wizard>();

    /**
     * @Override public void atacar(Personaje enemigo, Hechizo hechizo) {
     * 
     *           int danioTotal = 0; int curacion = 0; int curacionTotal; int danio2
     *           = 0; int eneSalud = enemigo.salud;
     * 
     * 
     *           if (hechizo.esOscuro) { this.magoOscuro = true; }
     * 
     *           if (this.magoOscuro) { danio2 = danio2 * 2; }
     * 
     *           curacionTotal = eneSalud + curacion; eneSalud = curacionTotal -
     *           danioTotal;
     * 
     *           if (eneSalud >= 100) { enemigo.estaVivo = true; eneSalud = 100; }
     *           else if (eneSalud < 1) { enemigo.estaVivo = false; eneSalud = 0;
     *           System.out.println("BYE BYE " + enemigo.nombre + " sos fiambre
     *           ;)"); } else { System.out.println("No tiene energia!"); } }
     * 
     * 
     * 
     * @Override public void atacar(Personaje p, String nombreDeHechizo) {
     * 
     *           Hechizo h = getHechizo(nombreDeHechizo); int eneSalud = p.salud;
     *           int danioHechizo = h.nivelDanio; int danio2 = 0; int curacion = 0;
     *           int danioTotal; int curacionTotal;
     * 
     * 
     * 
     *           this.energiaMagica = this.energiaMagica - h.nivelEnergia;
     *           danioTotal = danioHechizo + danio2;
     * 
     *           if (h.esOscuro) { this.magoOscuro = true; }
     * 
     *           if (this.magoOscuro) { danio2 = danio2 * 2; }
     * 
     *           curacionTotal = eneSalud + curacion; eneSalud = curacionTotal -
     *           danioTotal; // p.salud?
     * 
     *           if (eneSalud >= 100) { p.estaVivo = true; eneSalud = 100; } else if
     *           (eneSalud < 1) { p.estaVivo = false; eneSalud = 0;
     *           System.out.println("BYE BYE " + p.nombre + " sos fiambre ;)"); }
     *           else { System.out.println("No tiene energia!"); } }
     * 
     * 
     * 
     *           public Artefacto getArtefacto(String nombreDeArtefacto) { for
     *           (Artefacto a : this.artefactos) { if
     *           (a.nombreDeArtefacto.equals(nombreDeArtefacto)) { return a; } }
     *           return null; }
     * 
     *           public Artefacto setArtefacto(Artefacto artefacto) { return
     *           artefacto;
     * 
     *           }
     * 
     * @Override public Poder getPoderInicial() { return poderInicial; }
     * 
     * @Override public void setPoderInicial(Poder poderInicial) { this.poderInicial
     *           = poderInicial;
     * 
     *           }
     * 
     * @Override public void aprenderHechizo(Hechizo h) { this.hechizos.add(h); }
     * 
     *           public Hechizo getHechizo(String nombreDeHechizo) { for (Hechizo h
     *           : this.hechizos) { if (h.nombreDeHechizo.equals(h.nombreDeHechizo))
     *           { return h; } } return null; }
     * 
     * @Override public List<Artefacto> getArtefacto() { return null; }
     * 
     *           public boolean esOscuro(Hechizo h) { return magoOscuro;
     * 
     *           }
     * 
     */
    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

        int eneSalud = enemigo.salud;
        int curacion = 10; //¿?
        int danioHechizo = hechizo.nivelDanio;

        if (this.estaVivo && enemigo.estaVivo) {


            if (energiaMagica <= 10) {
                System.out.println("No puedes atacar, no tienes energía!");
            } else
                eneSalud = eneSalud - hechizo.nivelDanio;
                this.energiaMagica = this.energiaMagica - hechizo.nivelEnergia;

            if (hechizo.esOscuro) {
                this.magoOscuro = true;
                danioHechizo = danioHechizo * 2;
            }
            if (eneSalud >= 100) {
                enemigo.salud = 100;
                enemigo.estaVivo = true;
            } else if (eneSalud < 1) {
                enemigo.estaVivo = false;
                enemigo.salud = 0;
                System.out.println("Hasta la vista, " + enemigo.nombre + "has perdido!");

            } else if (enemigo.estaVivo) {
                System.out.println(enemigo.nombre + " tiene " + enemigo.salud + " puntos de salud.");
            }

        }
    }

    @Override
    public void atacar(Personaje p, String nombreHechizo) {
        
        Hechizo hechi = getHechizo(nombreHechizo);
        int eneSalud = p.salud;
        int curacion = 10; //¿?
        int danio = 0;

        if (this.estaVivo && p.estaVivo) {

            this.energiaMagica = this.energiaMagica - hechi.nivelEnergia;

            if (energiaMagica <= 10) {
                System.out.println("No puedes atacar, no tienes energía!");
            } else
                eneSalud = eneSalud - hechi.nivelDanio;

            if (hechi.esOscuro) {
                this.magoOscuro = true;
                danio = danio * 2;
            }

            if (eneSalud >= 100) {
                p.salud = 100;
                p.estaVivo = true;
            } else if (eneSalud < 1) {
                p.estaVivo = false;
                p.salud = 0;
                System.out.println("Hasta la vista, " + p.nombre + "has perdido!");

            } else if (p.estaVivo) {
                System.out.println(p.nombre + " tiene " + p.salud + " puntos de salud.");
            }

        }
        


        

    }
    public Hechizo getHechizo(String nombre) {

        for (Hechizo h : this.hechizos) {
            if (h.nombreDeHechizo.equals(nombre)) {
                return h;
            }
        }
        return null;
    }

    @Override
    public List<Artefacto> getArtefactos() {
        return artefactos;

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

}