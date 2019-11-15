/*
Clase Persona
 */
package lab5_rafaelflores_31711187;

import java.awt.Color;
import java.util.Date;
import javax.swing.tree.DefaultTreeModel;

public class Persona {
    String nombre, apellido, user, pass;
        Date fechaN;
        int edad;
        Color colorF;
        DefaultTreeModel mazos;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String user, String pass, Date fechaN, int edad, Color colorF) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.pass = pass;
        this.fechaN = fechaN;
        this.edad = edad;
        this.colorF = colorF;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setColorF(Color colorF) {
        this.colorF = colorF;
    }

    public void setMazos(DefaultTreeModel mazos) {
        this.mazos = mazos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public int getEdad() {
        return edad;
    }

    public Color getColorF() {
        return colorF;
    }

    public DefaultTreeModel getMazos() {
        return mazos;
    }

    @Override
    public String toString() {
        return nombre;
    }
        
        
}
