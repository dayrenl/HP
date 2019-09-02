package app.artefactos;

import app.interfaces.IReliquiaDeLaMuerte;

/**
 * VaritaDeSauco
 */
public class VaritaDeSauco extends Varita implements IReliquiaDeLaMuerte {

   

    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }

    public VaritaDeSauco(String nombreDeArtefacto, int amplificadorDanio, int amplificadorDeSalud) {
        super(nombreDeArtefacto, amplificadorDanio, amplificadorDeSalud);
    }

    


    

    
    


   

    
}