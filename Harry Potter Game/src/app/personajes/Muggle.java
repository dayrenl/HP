package app.personajes;

import java.util.ArrayList;
import java.util.List;

/**
 * Muggle
 */
public class Muggle extends Persona {

    public Muggle(String nombre, boolean estaVivo, int salud, int edad) {
        super(nombre, estaVivo, salud, edad);
    }

    public boolean elementoMagico = false;
    public String nombreMuggle;

   

    public static List<Muggle> muggle = new ArrayList<Muggle>();

   

}