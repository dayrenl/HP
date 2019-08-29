package app.interfaces;

import java.util.List;

import app.artefacto.Artefacto;
import app.personajes.Personaje;
import app.poder.Hechizo;
import app.poder.Poder;

public interface IHacerMagia {

    public void atacar(Personaje enemigo, Hechizo hechizo);
    public void atacar(Personaje p, String nombreHechizo);
    
    public List <Artefacto> getArtefactos(); //lista de artefactos
    
    public Poder getPoderInicial();
    public Poder setPoderInicial(Poder poderInicial);
    
    public void aprenderHechizo(Hechizo h);


}