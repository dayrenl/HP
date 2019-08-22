package app.personajes;

import java.util.ArrayList;
import java.util.List;
import app.poder.Hechizo;
import app.interfaces.IHacerMagia;

public class Wizard extends Personaje implements IHacerMagia {

List<Hechizo> hechizos = new ArrayList<Hechizo>();

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    
    
}