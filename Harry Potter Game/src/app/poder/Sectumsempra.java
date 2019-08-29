package app.poder;

/**
 * Sectumsempra
 */
public class Sectumsempra extends HechizoAtaque{

    
    public Sectumsempra(boolean esOscuro, int nivelCuracion, int nivelDanio, int nivelEnergia){
        this.esOscuro = true;
        this.nivelCuracion = 0;
        this.nivelDanio = 0;
        this.nivelEnergia = 0;

        /** DESPUES VEMOS CUANTO LE PONEMOS A LOS NIVELES */
    }

    public Sectumsempra(){
        
    }
}