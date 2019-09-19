package app.artefactos;

import app.interfaces.IReliquiaDeLaMuerte;

/**
 * CapaInvisibilidad
 */
public class CapaInvisibilidad extends Artefacto implements IReliquiaDeLaMuerte {

    public CapaInvisibilidad(String nombreDeArtefacto, int amplificadorDanio, int amplificadorDeSalud) {
        super(nombreDeArtefacto, amplificadorDanio, amplificadorDeSalud);
    }


    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }

    
}