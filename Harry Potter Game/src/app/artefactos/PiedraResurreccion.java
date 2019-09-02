package app.artefactos;

import app.interfaces.IReliquiaDeLaMuerte;

/**
 * PiedraResurreccion
 */
public class PiedraResurreccion extends Artefacto implements IReliquiaDeLaMuerte{

    

    public PiedraResurreccion(String nombreDeArtefacto, int amplificadorDanio, int amplificadorDeSalud) {
		super(nombreDeArtefacto, amplificadorDanio, amplificadorDeSalud);
	}

	@Override
    public boolean esReliquiaMuerte() {
        return false;
    }

    

    
    
}