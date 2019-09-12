package app.personajes;

import java.util.ArrayList;
import java.util.List;

/**
 * Muggle
 */
public class Muggle extends Persona {


    public Muggle(String nombre, int salud, int edad) {
        super(nombre, salud, edad);
    }

    public boolean elementoMagico = false;

   

    public static List<Muggle> muggle = new ArrayList<Muggle>();

   

}