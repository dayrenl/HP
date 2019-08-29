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

    

    public Horrocrux(int amplificadorDanio, int amplificadorDeSalud) {
        this.poder = null; //no es poder
        this.amplificadorDeSalud = 1;
        this.amplificadorDanio = 0;
    }

    public Horrocrux(){

    }

}