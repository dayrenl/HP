package app;

import java.util.ArrayList;
import java.util.List;

import app.artefacto.Artefacto;
import app.artefacto.CapaInvisibilidad;
import app.artefacto.Horrocrux;
import app.artefacto.PiedraResurreccion;
import app.artefacto.VaritaDeSauco;
import app.personajes.Elfo;
import app.personajes.Muggle;
import app.personajes.Personaje;
import app.personajes.Wizard;
import app.poder.CaveInimicum;
import app.poder.Crucio;
import app.poder.Hechizo;
import app.poder.Invisibilidad;
import app.poder.Metamorfosis;
import app.poder.ParselTongue;
import app.poder.PetrificusTotalus;
import app.poder.Poder;
import app.poder.Sectumsempra;
import app.poder.VulneraSanentur;
import app.poder.WingardiumLeviosa;

/**
 * Duels
 */
public class Duels {

    public static List<Personaje> personajes = new ArrayList<Personaje>();

    public static List<Artefacto> artefactos = new ArrayList<Artefacto>();

    public static List<Wizard> wizards = new ArrayList<Wizard>();
    
    public static void inicioDuelo() {
        Duels.agregarPersonajes();
    }

    public static void agregarPersonajes() {

        Wizard mago = new Wizard("Harry Potter", true, 100, 17, false, 90);
        Invisibilidad invisi = new Invisibilidad("Invisibilidad", 1, false, 50, 100, 80);
        mago.setPoderInicial(invisi);
        PiedraResurreccion resurrec = new PiedraResurreccion();
        resurrec.amplificadorDanio = 60;
        resurrec.amplificadorDeSalud = 100;
        mago.artefactos.add(resurrec);
        mago.getArtefacto();
        Sectumsempra sectum = new Sectumsempra(true, 0, 100, 100);
        mago.aprenderHechizo(sectum);
        CaveInimicum cave = new CaveInimicum(false, 50, 50, 70);
        mago.aprenderHechizo(cave);

        Duels.personajes.add(mago);

        Wizard mago1 = new Wizard("Hermione Granger", true, 100, 17, false, 100);
        Metamorfosis meta = new Metamorfosis("Metamorfosis", 2, false, 40, 100, 60);
        mago1.setPoderInicial(meta);
        CapaInvisibilidad capainvisi = new CapaInvisibilidad();
        capainvisi.amplificadorDanio = 50;
        capainvisi.amplificadorDeSalud = 60;
        artefactos.add(capainvisi);
        mago.getArtefacto();
        VulneraSanentur vulnera = new VulneraSanentur(false, 100, 0, 40);
        mago1.aprenderHechizo(vulnera);
        WingardiumLeviosa leviosa = new WingardiumLeviosa(false, 40, 60, 70);
        mago1.aprenderHechizo(leviosa);

        Duels.personajes.add(mago1);

        Elfo elf = new Elfo("Dobby", true, 100, 100);
        ParselTongue parsel = new ParselTongue("Parsel Tongue", 3, true, 50, 70, 87);
        elf.setPoderInicial(parsel);
        VaritaDeSauco varisauco = new VaritaDeSauco(100, 100);
        artefactos.add(varisauco);
        mago.getArtefacto();
        Crucio crucio = new Crucio(true, 0, 100, 100);
        elf.aprenderHechizo(crucio);
        PetrificusTotalus petri = new PetrificusTotalus(false, 10, 80, 70);
        elf.aprenderHechizo(petri);

        Duels.personajes.add(elf);

        Elfo elf1 = new Elfo("Kreacher", true, 100, 120);
        Metamorfosis meta1 = new Metamorfosis("Metamorfosis", 4, false, 40, 100, 54); //NIVEL ENERGIA DISMINUYE
        elf1.setPoderInicial(meta1);
        Horrocrux horrocrux = new Horrocrux(100, 100);
        artefactos.add(horrocrux);
        elf1.getArtefacto();
        Sectumsempra sectum1 = new Sectumsempra(true, 0, 100, 100);
        elf1.aprenderHechizo(sectum1);
        WingardiumLeviosa levi1 = new WingardiumLeviosa(false, 40, 20, 10);
        elf1.aprenderHechizo(levi1);

        Duels.personajes.add(elf1);

        Muggle mugg = new Muggle("Dudley Dursley", true, 100, 17);
        Duels.personajes.add(mugg);

        Muggle mugg1 = new Muggle("Petunia Potter", true, 100, 17);
        Duels.personajes.add(mugg1);

    }

    public static Personaje getPersonaje(String nombre, boolean estaVivo, int salud, int edad, boolean magoOcuro, int energiaMagica) {
        for (Personaje p : Duels.personajes) {
            if (p.nombre.equals(nombre)) 
                return p;
        }
        return null;
    }
    

}