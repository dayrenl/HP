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
    public int energiaMagica;
    public Artefacto artefacto;

    public static List<Wizard> wizards = new ArrayList<Wizard>();

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {
        int eneSalud = enemigo.salud;
        int danio = hechizo.nivelDanio;
        int danioTotal;
        int curacion = 0;
        int curacionTotal;
        int danio2 = 0;
       

        

            this.energiaMagica = this.energiaMagica - hechizo.nivelEnergia;
            danioTotal = danio + danio2;

            if (hechizo.esOscuro) {
                this.magoOscuro = true;
            }

            if (this.magoOscuro) {
                danio2 = danio2 * 2;
            }

            curacionTotal = eneSalud + curacion;

            enemigo.salud = curacionTotal - danioTotal;

            if (enemigo.salud >= 100) {
                enemigo.estaVivo = true;
                enemigo.salud = 100;
            } else if (enemigo.salud < 1) {
                enemigo.estaVivo = false;
                enemigo.salud = 0;
            } else {
                System.out.println("No tiene energia!");
            }

        }

    

    @Override
    public void atacar(Personaje p, String nombreHechizo) {

        Hechizo h = getHechizo(nombreHechizo);
        int eneSalud = p.salud;
        int danio = h.nivelDanio;
        int danio2 = 0;
        int curacion = 0;
        int danioTotal;
      
        int curacionTotal;

    

            this.energiaMagica = this.energiaMagica - h.nivelEnergia;

            danioTotal = danio + danio2;

            if (h.esOscuro) {
                this.magoOscuro = true;
            }

            if (this.magoOscuro) {
                danioTotal = danioTotal * 2;
            }

            curacionTotal = eneSalud + curacion;

            eneSalud = (int) curacionTotal - danioTotal;

            if (eneSalud >= 1 && eneSalud <= 100) {
                p.estaVivo = true;
            }
            if (eneSalud < 1) {
                p.estaVivo = false;

            } else {
                System.out.println("No tiene energia!");
            }
        }

    

    public Artefacto getArtefacto(String nombreDeArtefacto) {
        for (Artefacto a : this.artefactos) {
            if (a.nombreDeArtefacto.equals(nombreDeArtefacto)) {
                return a;
            }
        }
        return null;
    }

    public Artefacto setArtefacto(Artefacto artefacto) {
        return artefacto;

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

    public Hechizo getHechizo(String nombreDeHechizo) {
        for (Hechizo h : this.hechizos) {
            if (h.nombreDeHechizo.equals(nombreDeHechizo)) {
                return h;
            }
        }
        return null;
    }

    @Override
    public List<Artefacto> getArtefacto() {
        return null;
    }

    public boolean esOscuro(Hechizo h) {
        return magoOscuro;

    }

}