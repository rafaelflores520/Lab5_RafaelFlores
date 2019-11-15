/*
Clase Carta
 */
package lab5_rafaelflores_31711187;

public class Cartas {
    String nombre, objetivo, velocidad;
    int daño, ptsVida, coste;

    public Cartas() {
    }

    public Cartas(String nombre, String objetivo, String velocidad, int daño, int ptsVida, int coste) {
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.velocidad = velocidad;
        this.daño = daño;
        this.ptsVida = ptsVida;
        this.coste = coste;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public void setPtsVida(int ptsVida) {
        this.ptsVida = ptsVida;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public int getDaño() {
        return daño;
    }

    public int getPtsVida() {
        return ptsVida;
    }

    public int getCoste() {
        return coste;
    }

    @Override
    public String toString() {
        return "La Carta "+nombre
                +"\nAtaca objetivos: "+objetivo
                +"\nTiene una Velocidad: "+velocidad+"Km/h"
                +"\nInflinge un Daño: "+daño+"pts"
                +"\nTienes estos puntos de Vida: "+ptsVida+"pts"
                +"\nTienes un coste de: "+coste+" elixir";
    }
    
    
}
