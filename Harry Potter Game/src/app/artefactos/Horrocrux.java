package app.artefactos;

import app.interfaces.IReliquiaDeLaMuerte;

/**
 * Horocrux
 */
public class Horrocrux extends Artefacto implements IReliquiaDeLaMuerte{

    

    public Horrocrux(String nombreDeArtefacto, int amplificadorDanio, int amplificadorDeSalud) {
        super(nombreDeArtefacto, amplificadorDanio, amplificadorDeSalud);
    }

    @Override
    public boolean esReliquiaMuerte() {
        return false;
    }

    

  

}