package app.artefacto;

import app.interfaces.IReliquiaDeLaMuerte;

/**
 * CapaInvisibilidad
 */
public class CapaInvisibilidad extends Artefacto implements IReliquiaDeLaMuerte {

    public CapaInvisibilidad(int amplificadorDeSalud, int amplificadorDanio) {
        this.poder = null;
        this.amplificadorDeSalud = 0;
        this.amplificadorDanio = 0;
    }

    public CapaInvisibilidad() {

    }

    

    @Override
    public boolean esInvisible() {
        return super.esInvisible();
    }

    @Override
    public boolean esInvisibleAMuggles() {
        return super.esInvisibleAMuggles();
    }

    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }

}