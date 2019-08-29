package app.transporte;

import app.interfaces.IEsMagico;

/**
 * TrenExpresoHogwarts
 */
public class TrenExpresoHogwarts extends Transporte implements IEsMagico {

    @Override
    public boolean esInvisibleAMuggles() {
        return true;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }

    public TrenExpresoHogwarts(String nombreDeTransporte, int nroDeTransporte) {
        super(nombreDeTransporte, nroDeTransporte);
    }

    public TrenExpresoHogwarts() {
    }

    
}