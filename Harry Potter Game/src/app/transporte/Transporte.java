package app.transporte;

import java.util.ArrayList;
import java.util.List;

/**
 * Transporte
 */
public class Transporte {

    public int nroDeTransporte;
    public String nombreDeTransporte;

    public static List<Transporte> transporte = new ArrayList<Transporte>();

    public Transporte(String nombreDeTransporte, int nroDeTransporte){
        this.nombreDeTransporte = nombreDeTransporte;
        this.nroDeTransporte = nroDeTransporte;
    }

    public Transporte() {
	}

	public static void agregarTransporte(String nombreDeTransporte, int nroDeTransporte){
        Transporte transp = new Transporte();
        transp.nombreDeTransporte = "Escoba";
        transp.nroDeTransporte = 1;

        transporte.add(transp);

        transp.nombreDeTransporte = "Tren Expreso de Hogwarts";
        transp.nroDeTransporte = 2;

        transporte.add(transp);

        
        
    }
//RECORRE LOS TRANSPORTE PARA VER EL ADECUADO
    public static Transporte selecTransporte(int nro)
    {
        for(Transporte transp: transporte)
        {   if(transp.nroDeTransporte == nro)
                return transp;

        }
        return null;
    }
}
    
