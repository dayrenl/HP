package app.artefacto;

import app.interfaces.IReliquiaDeLaMuerte;

/**
 * VaritaDeSauco
 */
public class VaritaDeSauco extends Varita implements IReliquiaDeLaMuerte {

    @Override
    public boolean esReliquiaMuerte() {
        return false;
    }

    
}