package app.transporte;

import app.interfaces.IEsMagico;

/**
 * Escoba
 */
public class Escoba extends Transporte implements IEsMagico{

    
    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
    return true; 
    }

    public Escoba(String nombreDeTransporte, int nroDeTransporte) {
        super(nombreDeTransporte, nroDeTransporte);
    }

    public Escoba() {
    }

     
}