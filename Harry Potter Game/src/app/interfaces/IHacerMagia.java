package app.interfaces;


import app.artefacto.Artefacto;
import app.personajes.Personaje;
import app.poder.Hechizo;
import app.poder.Poder;

public interface IHacerMagia {

    public void atacar(Personaje enemigo, Hechizo hechizo);

    public void atacar(Personaje p, String nombreHechizo);

    public Artefacto getArtefacto(); 

    public Poder getPoderInicial();

    public void setPoderInicial(Poder poderInicial);

    public void aprenderHechizo(Hechizo h);

}