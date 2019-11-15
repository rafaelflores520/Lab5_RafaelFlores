/*
Carta Legendaria
 */
package lab5_rafaelflores_31711187;

import java.util.ArrayList;

public class Legendaria extends Cartas {
    ArrayList<Cartas> posiblesCarta = new ArrayList();

    public Legendaria(String nombre, String objetivo, String velocidad, int daño, int ptsVida, int coste) {
        super(nombre, objetivo, velocidad, daño, ptsVida, coste);
    }

    public Legendaria() {
        this.posiblesCarta.add(new Legendaria("Leñador", "Terrestres", "Alta", 0, 0, 4));
        this.posiblesCarta.add(new Legendaria("Dragon Infernal", "Aereos y Terrestres", "Media", 0, 0, 4));
    }

    public ArrayList<Cartas> getPosiblesCarta() {
        return posiblesCarta;
    }
    
}
