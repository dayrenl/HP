package app.artefacto;

import app.interfaces.IReliquiaDeLaMuerte;

/**
 * Horocrux
 */
public class Horrocrux extends Artefacto implements IReliquiaDeLaMuerte{

    

    @Override
    public boolean esReliquiaMuerte() {
        return false;
    }

    public Horrocrux(int amplificadorDanio, int amplificadorDeSalud, String nombreArtefacto) {
        super(amplificadorDanio, amplificadorDeSalud, nombreArtefacto);
    }

    public Horrocrux() {
    }

}