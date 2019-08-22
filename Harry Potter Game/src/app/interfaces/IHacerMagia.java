package app.interfaces;

import app.poder.Hechizo;
import app.personajes.Personaje;

public interface IHacerMagia {

    void atacar(Personaje enemigo, Hechizo hechizo);
    
    //getPoderInicial(); - poder
    //setPoderInicial(Poder p );
    //aprender(Hechizo h);
    //getArtefactos() / list<artefacto>
    //atacar(personaje p, String nombre hechizo);
}