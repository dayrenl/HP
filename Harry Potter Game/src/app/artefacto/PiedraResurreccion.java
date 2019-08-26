package app.artefacto;

import app.interfaces.IReliquiaDeLaMuerte;

/**
 * PiedraResurreccion
 */
public class PiedraResurreccion extends Artefacto implements IReliquiaDeLaMuerte{

    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }

    
}