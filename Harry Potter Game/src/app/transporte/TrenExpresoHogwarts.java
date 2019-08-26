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

    
}