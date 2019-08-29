package app.artefacto;

import app.interfaces.IReliquiaDeLaMuerte;

/**
 * PiedraResurreccion
 */
public class PiedraResurreccion extends Artefacto implements IReliquiaDeLaMuerte{

    

    @Override
    public boolean esReliquiaMuerte() {
        return false;
    }

    /** public PiedraResurreccion(int amplificadorDanio, int amplificadorDeSalud, String nombreArtefacto) {
        super(amplificadorDanio, amplificadorDeSalud, nombreArtefacto);
    } */

    public PiedraResurreccion(int amplificadorDanio, int amplificadorDeSalud) {
        this.poder = null;
        this.amplificadorDanio = 0;
        this.amplificadorDeSalud = 0;
    }

    public PiedraResurreccion(){

    }
    
}