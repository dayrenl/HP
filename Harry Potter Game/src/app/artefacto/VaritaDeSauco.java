package app.artefacto;

import app.interfaces.IReliquiaDeLaMuerte;

/**
 * VaritaDeSauco
 */
public class VaritaDeSauco extends Varita implements IReliquiaDeLaMuerte {

   

    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }

    public VaritaDeSauco(int amplificadorDanio, int amplificadorDeSalud, String nombreArtefacto) {
        super(amplificadorDanio, amplificadorDeSalud, nombreArtefacto);
    }

    public VaritaDeSauco() {
    }

    
}