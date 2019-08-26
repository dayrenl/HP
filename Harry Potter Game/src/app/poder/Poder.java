package app.poder;

import java.util.ArrayList;
import java.util.List;

/**
 * Poder
 */
public class Poder {

    public String nombre;

    public List<Poder> poderes = new ArrayList<Poder>();

    public void agregarPoderes() {

        Poder p = new Poder();
        p.nombre = "Parseltongue";
        poderes.add(p);

        p = new Poder();
        p.nombre = "Invisibilidad";
        poderes.add(p);

        p = new Poder();
        p.nombre = "Metamorfosis";
        poderes.add(p);

    }
}