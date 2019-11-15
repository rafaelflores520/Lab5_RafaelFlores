/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_rafaelflores_31711187;

import java.util.ArrayList;

public class Especial extends Cartas{
    ArrayList<Cartas> posiblesCarta = new ArrayList();

    public Especial(String nombre, String objetivo, String velocidad, int daño, int ptsVida, int coste) {
        super(nombre, objetivo, velocidad, daño, ptsVida, coste);
    }
    
    public Especial() {
        this.posiblesCarta.add(new Especial("MiniPekka", "Terrestres", "Alta", 0, 0, 4));
        this.posiblesCarta.add(new Especial("MontaPuerco", "Terrestres", "Alta", 0, 0, 4));
    }

    public ArrayList<Cartas> getPosiblesCarta() {
        return posiblesCarta;
    }
}
