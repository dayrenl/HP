package app.interfaces;

import app.poder.Hechizo;
import app.poder.Poder;
import app.artefacto.Artefacto;
import app.personajes.Personaje;

public interface IHacerMagia {

    public void atacar(Personaje enemigo, Hechizo hechizo);
    public void atacar(Personaje enemigo, String nombreHechizo);
    public Artefacto getArtefactos();
    public Poder getPoderInicial(Poder poder);
    public Poder setPoderInicial(Poder poder);
    public void aprenderHechizo(Hechizo hechizo);


}