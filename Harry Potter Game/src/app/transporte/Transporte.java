package app.transporte;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.IEsMagico;

/**
 * Transporte
 */
public class Transporte implements IEsMagico {

    public int nroDeTransporte;
    public String nombreDeTransporte;

    public static List<Transporte> transporte = new ArrayList<Transporte>();

    public Transporte(String nombreDeTransporte, int nroDeTransporte){
        this.nombreDeTransporte = nombreDeTransporte;
        this.nroDeTransporte = nroDeTransporte;
    }

    public Transporte() {
	}

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }

}
    
