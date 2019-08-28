package app.artefacto;

import java.util.List;
import java.util.ArrayList;

import app.interfaces.IEsMagico;
import app.poder.Poder;

/**
 * Artefacto
 */
public class Artefacto implements IEsMagico {

    public Poder poder;
    public int amplificadorDanio;
    public int amplificadorDeSalud;
    public String nombreArtefacto;

    public Artefacto(int amplificadorDanio, int amplificadorDeSalud, String nombreArtefacto) {
        this.amplificadorDanio = amplificadorDanio;
        this.amplificadorDeSalud = amplificadorDeSalud;
        this.nombreArtefacto = nombreArtefacto;
    }

    public Artefacto() {

    }

    public static List<Artefacto> artefactos = new ArrayList<Artefacto>();

    

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }

}