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
        enemigo.salud = enemigo.salud - 20;
    



        if (eneSalud > 0) {
            enemigo.estaVivo = true;
        } else if (eneSalud < 1) {
            enemigo.estaVivo = false;
            eneSalud = 0;
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
          return null;    }

    @Override
    public List<Artefacto> getArtefacto() {
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

        Hechizo h = getHechizo(nombreDeHechizo);
        int eneSalud = p.salud;
        int danioHechizo = h.nivelDanio;
        int danio2 = 0;
        int curacion = 0;
        int danioTotal;
        IHacerMagia magia;
        int curacionTotal;

            for (int i = 0; i < artefactos.size(); i++) {
                danio2 = danio2 + (h.nivelDanio * this.artefactos.get(i).amplificadorDanio);
            }

            if (p instanceof IHacerMagia) {
                magia = (IHacerMagia) p;
                for (int i = 0; i < magia.getArtefacto().size(); i++) {
                    curacion = curacion + (magia.getArtefacto().get(i).amplificadorDeSalud);
                }
            }

            danioTotal = h.nivelDanio + danio2;
           

            curacionTotal = eneSalud + curacion;

            eneSalud =  curacionTotal - danioTotal;

            if (eneSalud >= 100) {
                p.estaVivo = true;
                eneSalud = 100;
            }
            if (eneSalud < 1) {
                p.estaVivo = false;
                eneSalud = 0;
                System.out.println("BYE BYE + " + p.nombre + "sos fiambre ;)");
            } else {
                System.out.println("No tiene energia!");
            }

    }

    @Override
    public void getArtefacto(Artefacto a) {

    }

    @Override
    public Artefacto gArtefacto(String nombreDeArtefacto) {
        return null;
    }

}