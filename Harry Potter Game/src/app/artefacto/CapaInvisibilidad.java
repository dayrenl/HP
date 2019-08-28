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

    public CapaInvisibilidad(int amplificadorDanio, int amplificadorDeSalud, String nombreArtefacto) {
        super(amplificadorDanio, amplificadorDeSalud, nombreArtefacto);
    }

    public CapaInvisibilidad() {
    }

    
}