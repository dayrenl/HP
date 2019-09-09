package app.personajes;

import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.poderes.Poder;

/**
 * Persona
 */
public class Persona extends Personaje implements IHacerMagia {

    public Persona(String nombre, boolean estaVivo, int salud, int edad) {
        super(nombre, estaVivo, salud, edad);
    }
/** 
    @Override
    public void aprenderHechizo(Hechizo h) {

    }

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    @Override
    public void atacar(Personaje p, String nombreHechizo) {

    }

    @Override
    public List<Artefacto> getArtefacto() {
        return null;
    }

    @Override
    public Poder getPoderInicial() {
        return null;
    }

    @Override
    public void setPoderInicial(Poder poderInicial) {

    }

    @Override
    public Hechizo getHechizo(String nombreDeHechizo) {
        return null;
    } */

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {
    

    }

    @Override
    public void atacar(Personaje p, String nombreHechizo) {
      

    }

    @Override
    public List<Artefacto> getArtefactos() {
        
        return null;
    }

    @Override
    public Poder getPoderInicial() {
        return null;
    }

    @Override
    public void setPoderInicial(Poder poderInicial) {

    }

    @Override
    public void aprenderHechizo(Hechizo h) {

    }

    

    
   

    
}