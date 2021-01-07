
package gato;

import java.io.Serializable;

public class Usuario implements Serializable{
    private String nombre;
    private int edad;
    private int puntiacion;
    
    public Usuario(){
        
    }

    public Usuario(String nombre, int edad, int puntiacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.puntiacion = puntiacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntiacion() {
        return puntiacion;
    }

    public void setPuntiacion(int puntiacion) {
        this.puntiacion = puntiacion;
    }
    
    
}
