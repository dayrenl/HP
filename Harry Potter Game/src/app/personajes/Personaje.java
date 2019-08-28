package app.personajes;

import app.artefacto.Artefacto;
import app.poder.Hechizo;
import app.transporte.Transporte;

/**
 * Personaje
 */
public class Personaje {

    public String nombre;
    public boolean estaVivo = true;
    public int salud = 100;
    public int edad;

    public Personaje(String nombre, boolean estaVivo, int salud, int edad) {
        this.nombre = nombre;
        this.estaVivo = estaVivo;
        this.salud = salud;
        this.edad = edad;
    }

    public Personaje(Hechizo h, Artefacto art, Transporte transporte){

    }
    
    
}