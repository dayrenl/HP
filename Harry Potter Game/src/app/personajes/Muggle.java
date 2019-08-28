package app.personajes;

import java.util.ArrayList;
import java.util.List;

/**
 * Muggle
 */
public class Muggle extends Persona {

    public boolean elementoMagico = false;
    public String nombreMuggle;

    public Muggle(String nombreMuggle) {
        this.nombreMuggle = nombreMuggle;
    }

    public Muggle() {

    }

    public static List<Muggle> muggle = new ArrayList<Muggle>();

   

}