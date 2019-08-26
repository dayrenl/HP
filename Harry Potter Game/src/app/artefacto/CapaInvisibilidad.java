package app.artefacto;

import app.interfaces.IReliquiaDeLaMuerte;

/**
 * CapaInvisibilidad
 */
public class CapaInvisibilidad extends Artefacto implements IReliquiaDeLaMuerte {

    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }

    
}