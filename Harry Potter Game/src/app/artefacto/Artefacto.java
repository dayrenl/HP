package app.artefacto;

//import java.util.List;
//import java.util.ArrayList;

import app.interfaces.IEsMagico;
import app.poder.Poder;

/**
 * Artefacto
 */
public class Artefacto implements IEsMagico {

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

}