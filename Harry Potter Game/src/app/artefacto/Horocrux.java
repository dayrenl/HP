package app.artefacto;

import app.interfaces.IReliquiaDeLaMuerte;

/**
 * Horocrux
 */
public class Horocrux extends Artefacto implements IReliquiaDeLaMuerte{

    @Override
    public boolean esReliquiaMuerte() {
        return false;
    }

    
}