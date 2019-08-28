package app.interfaces;

import app.artefacto.Artefacto;
import app.personajes.Personaje;
import app.poder.Hechizo;
import app.poder.Poder;

public interface IHacerMagia {

    public void atacar(Personaje enemigo, Hechizo hechizo);
    public void atacar(Personaje enemigo, String nombreHechizo);
    public Artefacto getArtefactos(); //lista de artefactos
    public Poder getPoderInicial(Poder poder);
    public Poder setPoderInicial(Poder poder);
    public void aprenderHechizo(Hechizo hechizo);


}