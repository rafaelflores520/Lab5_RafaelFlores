/*
Clase Persona
 */
package lab5_rafaelflores_31711187;

import java.awt.Color;
import java.util.Date;

public class Persona {
    String nombre, apellido, user, pass;
        Date fechaN;
        int edad;
        Color colorF;
        Mazo m1, m2, m3;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String user, String pass, Date fechaN, int edad, Color colorF, Mazo m1, Mazo m2, Mazo m3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.pass = pass;
        this.fechaN = fechaN;
        this.edad = edad;
        this.colorF = colorF;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
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

    public void setM1(Mazo m1) {
        this.m1 = m1;
    }

    public void setM2(Mazo m2) {
        this.m2 = m2;
    }

    public void setM3(Mazo m3) {
        this.m3 = m3;
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

    public Mazo getM1() {
        return m1;
    }

    public Mazo getM2() {
        return m2;
    }

    public Mazo getM3() {
        return m3;
    }

    @Override
    public String toString() {
        return nombre;
    }
        
        
}
