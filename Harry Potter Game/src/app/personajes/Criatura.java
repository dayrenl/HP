package app.personajes;

import app.interfaces.IEsMagico;

/**
 * Criatura
 */
public class Criatura extends Personaje implements IEsMagico {
    

    public Criatura(String nombre, int salud, int edad) {
        super(nombre, salud, edad);
    }

    @Override
    public boolean esInvisible() {
        return false;
    }

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    
    
}