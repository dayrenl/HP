package app.personajes;

import java.util.ArrayList;
import java.util.List;
import app.poder.Hechizo;
import app.poder.Poder;
import app.artefacto.Artefacto;
import app.interfaces.IHacerMagia;



public class Wizard extends Personaje implements IHacerMagia {

    public int energiaMagica;

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();


    public static List <Wizard> Wiz(){
        List<Wizard> wiz = new ArrayList<Wizard>();
    
        Wizard wiz1 = new Wizard();
        wiz1.nombre = "Harry 'ElPibeQueSobrevivio' Potter";
        wiz1.edad = 17;
        wiz1.salud = 100;
        wiz1.estaVivo = true;
        wiz.add(wiz1);

        Wizard wiz2 = new Wizard();
        wiz2.nombre = "Hermione 'AbajoElPatriarcadoQueVaACaer' Granger";
        wiz2.edad = 17;
        wiz2.salud = 100;
        wiz2.estaVivo = true;
        wiz.add(wiz2);

        Wizard wiz3 = new Wizard();
        wiz3.nombre = "Draco 'Todxs Sangre Sucia' Malfoy";
        wiz3.edad = 17;
        wiz3.salud = 100;
        wiz3.estaVivo = true;
        wiz.add(wiz3);

        Wizard wiz4 = new Wizard();
        wiz4.nombre = "Severus 'Always :'(' Snape ";
        wiz4.edad = 45;
        wiz4.salud = 100;
        wiz4.estaVivo = true;
        wiz.add(wiz4);


        Wizard wiz5 = new Wizard();
        wiz5.nombre = "Minerva 'Vieji Copada' McGonagall";
        wiz5.edad = 70;
        wiz5.salud = 100;
        wiz5.estaVivo = true;
        wiz.add(wiz5);


        Wizard wiz6 = new Wizard();
        wiz6.nombre = "Dolores 'No Pun Intended' Umbridge";
        wiz6.edad = 55;
        wiz6.salud = 100;
        wiz6.estaVivo = true;
        wiz.add(wiz6);


        Wizard wiz7 = new Wizard();
        wiz7.nombre = "Albus Dumbledore";
        wiz7.edad = 75;
        wiz7.salud = 100;
        wiz7.estaVivo = true;
        wiz.add(wiz7);


        Wizard wiz8 = new Wizard();
        wiz8.nombre = "Bellatrix Lestrange";
        wiz8.edad = 45;
        wiz8.salud = 100;
        wiz8.estaVivo = true;
        wiz.add(wiz8);


        Wizard wiz9 = new Wizard();
        wiz9.nombre = "Ron 'El colo' Weasley";
        wiz9.edad = 17;
        wiz9.salud = 100;
        wiz9.estaVivo = true;
        wiz.add(wiz9);



        return wiz;


    
    }


    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    @Override
    public void atacar(Personaje enemigo, String nombreHechizo) {

    }

    @Override
    public Artefacto getArtefactos() {
        return null;
    }

    @Override
    public Poder getPoderInicial(Poder poder) {
        return null;
    }

    @Override
    public Poder setPoderInicial(Poder poder) {
        return null;
    }

    @Override
    public void aprenderHechizo(Hechizo hechizo) {

    }

    
    
    
}