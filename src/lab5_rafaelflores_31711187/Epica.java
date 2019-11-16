/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_rafaelflores_31711187;

import java.util.ArrayList;

public class Epica extends Cartas{
    ArrayList<Cartas> posiblesCarta = new ArrayList();

    public Epica(String nombre, String objetivo, String velocidad, int daño, int ptsVida, int coste) {
        super(nombre, objetivo, velocidad, daño, ptsVida, coste);
    }

    public void setPosiblesCarta(ArrayList<Cartas> posiblesCarta) {
        this.posiblesCarta.add(new Cartas("Golem", "Terrestres", "Baja", 0, 0, 8));
        this.posiblesCarta.add(new Cartas("Dragon", "Aereos y Terrestres", "Media", 0, 0, 4));
    }

    public ArrayList<Cartas> getPosiblesCarta() {
        return posiblesCarta;
    }
}
