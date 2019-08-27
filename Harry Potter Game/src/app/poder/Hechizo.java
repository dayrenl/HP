package app.poder;

import java.util.List;
import java.util.ArrayList;

/**
 * Hechizo
 */
public class Hechizo extends Poder {

    public int nroDeHechizo;
    public String nombreDeHechizo;

    public static List<Hechizo> hechizos = new ArrayList<Hechizo>();

    public Hechizo (String nombreDeHechizo, int nroDeHechizo){
        this.nombreDeHechizo = nombreDeHechizo;
        this.nroDeHechizo = nroDeHechizo;
    }
    public Hechizo(){

    }
    
    public void invocaHechizo (String nombreDeHechizo){
        System.out.println(this.nombre + " : " + nombreDeHechizo); //nombrewiz: falta crear contenders
    }


    public static Hechizo getHechizos(String nombreDeHechizo) {
        for(Hechizo hech : Hechizo.hechizos) {
            if (hech.nombreDeHechizo.equals(nombreDeHechizo))
                return hech;
        }
        return null;
    }

    public boolean esOscuro()
    {
        return this.esOscuro;
    }

    public static void IniciarHechizo(){
        Hechizo.agregarHechizo();
    }

    public static void agregarHechizo() {

        Hechizo hech1 = new Hechizo();
        hech1.nombreDeHechizo = "Sectum Sempra"; // hechizo oscuro, produce cortaditas
        hech1.nroDeHechizo = 1;
        hech1.esOscuro = true;
        hech1.nivelCuracion = 35;
        hech1.nivelDanio = 70;
        hechizos.add(hech1);

        Hechizo hech2 = new Hechizo();
        hech2.nombreDeHechizo = "Vulnera Sanentur"; // cura el hechizo sectum sempra
        hech2.nroDeHechizo = 2;
        hech2.esOscuro = false;
        hech2.nivelCuracion = 100;
        hech2.nivelDanio = 0;
        hechizos.add(hech2);

        Hechizo hech3 = new Hechizo();
        hech3.nombreDeHechizo = "Wingardium Leviosa"; // hace levitar cosas
        hech3.nroDeHechizo = 3;
        hech3.esOscuro = false;
        hech3.nivelCuracion = 0;
        hech3.nivelDanio = 60;
        hechizos.add(hech3);

        Hechizo hech4 = new Hechizo();
        hech4.nombreDeHechizo = "Cave Inimicum"; // mantiene a los enemigos alejados
        hech4.nroDeHechizo = 4;
        hech4.esOscuro = false;
        hech4.nivelCuracion = 0;
        hech4.nivelDanio = 0;
        hechizos.add(hech4);

        Hechizo hech5 = new Hechizo();
        hech5.nombreDeHechizo = "Avada Kedavra"; // mata de una
        hech5.nroDeHechizo = 5;
        hech5.esOscuro = true;
        hech5.nivelCuracion = 0;
        hech5.nivelDanio = 100;
        hechizos.add(hech5);

        Hechizo hech6 = new Hechizo();
        hech6.nombreDeHechizo = "Crucio"; // hechizo de tortura
        hech6.nroDeHechizo = 5;
        hech6.esOscuro = true;
        hech6.nivelCuracion = 0;
        hech6.nivelDanio = 100;
        hechizos.add(hech6);


    }

    
}