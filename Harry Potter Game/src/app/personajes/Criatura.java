package app.personajes;

import app.interfaces.IEsMagico;

/**
 * Criatura
 */
public class Criatura extends Personaje implements IEsMagico {
    

    @Override
    public boolean esInvisible() {
        return false;
    }

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    public Criatura(String nombre, boolean estaVivo, int salud, int edad) {
        super(nombre, estaVivo, salud, edad);
    }
    
}