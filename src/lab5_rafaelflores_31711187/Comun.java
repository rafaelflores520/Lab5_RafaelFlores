/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_rafaelflores_31711187;

import java.util.ArrayList;

/**
 *
 * @author Faith
 */
public class Comun extends Cartas{
    ArrayList<Cartas> posiblesCarta = new ArrayList();

    public Comun() {
        this.posiblesCarta.add(new Cartas("Gigante Nombre", "Terrestres", "Media", 0, 0, 6));
        this.posiblesCarta.add(new Cartas("Pandilla de Duendes", "Aereos y Terrestres", "Alta", 0, 0, 3));
    }

    public ArrayList<Cartas> getPosiblesCarta() {
        return posiblesCarta;
    }
}
