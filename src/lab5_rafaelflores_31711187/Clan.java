/*
Clase Clan
 */
package lab5_rafaelflores_31711187;

import java.util.ArrayList;
import java.util.Date;


public class Clan {
    String nombre, tipo;
    Date fechaC;
    Persona lider;
    ArrayList<Persona> amigos= new ArrayList();

    public Clan() {
    }

    public Clan(String nombre, String tipo, Date fechaC, Persona lider) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaC = fechaC;
        this.lider = lider;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFechaC(Date fechaC) {
        this.fechaC = fechaC;
    }

    public void setLider(Persona lider) {
        this.lider = lider;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFechaC() {
        return fechaC;
    }

    public Persona getLider() {
        return lider;
    }

    @Override
    public String toString() {
        return "Clan{" + "nombre=" + nombre + '}';
    }
    
}
