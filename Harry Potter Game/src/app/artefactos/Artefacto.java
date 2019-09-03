package app.artefactos;

import app.interfaces.IEsMagico;
import app.poderes.Poder;

/**
 * Artefacto
 */
public class Artefacto implements IEsMagico {

    public String nombreDeArtefacto;
    public Poder poder;
    public int amplificadorDanio;
    public int amplificadorDeSalud;

    @Override
    public boolean esInvisibleAMuggles() {
        return true;
    }

    @Override
    public boolean esInvisible() {
        return true;
    }

    public Artefacto(String nombreDeArtefacto, int amplificadorDanio, int amplificadorDeSalud) {
        this.amplificadorDanio = amplificadorDanio;
        this.amplificadorDeSalud = amplificadorDeSalud;
        this.nombreDeArtefacto = nombreDeArtefacto;
    }

    public String getNombreDeArtefacto() {
        return nombreDeArtefacto;
    }

    public void setNombreDeArtefacto(String nombreDeArtefacto) {
        this.nombreDeArtefacto = nombreDeArtefacto;
    }

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    public int getAmplificadorDanio() {
        return amplificadorDanio;
    }

    public void setAmplificadorDanio(int amplificadorDanio) {
        this.amplificadorDanio = amplificadorDanio;
    }

    public int getAmplificadorDeSalud() {
        return amplificadorDeSalud;
    }

    public void setAmplificadorDeSalud(int amplificadorDeSalud) {
        this.amplificadorDeSalud = amplificadorDeSalud;
    }
//TO STRING ARTEFACTO?
}