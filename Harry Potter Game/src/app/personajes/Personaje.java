package app.personajes;


/**
 * Personaje
 */
public class Personaje {

    public String nombre;
    public boolean estaVivo = true;
    public int salud = 100;
    public int edad;
	

    public Personaje(String nombre, boolean estaVivo, int salud, int edad) {
        this.nombre = nombre;
        this.estaVivo = estaVivo;
        this.salud = salud;
        this.edad = edad;
    }
    public Personaje (){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personaje [edad=" + edad + ", estaVivo=" + estaVivo + ", nombre=" + nombre + ", salud=" + salud + "]";
    }
	
	

    

	

	
    
  
}