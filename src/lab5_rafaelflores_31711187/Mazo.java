/*
Clase Mazo
 */
package lab5_rafaelflores_31711187;

import java.util.ArrayList;

public class Mazo {
    int coste;
    ArrayList<Cartas> cartas = new ArrayList();

    public Mazo() {
    }

    public Mazo(int coste) {
        this.coste = coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public void setCartas(ArrayList<Cartas> cartas) {
        this.cartas = cartas;
    }

    public int getCoste() {
        return coste;
    }

    public ArrayList<Cartas> getCartas() {
        return cartas;
    }

    @Override
    public String toString() {
        return String.valueOf(coste);
    }
    
    
}
