package encinas.domain;

import encinas.interfaces.Item;
import java.util.HashSet;


public class Desayuno {

    //Atributos

    private HashSet<Item> items = new HashSet();
    private Float coste = null;

    //Constructor

    public Desayuno() {
    }

    //Getters $ Setters

    public HashSet<Item> getItems() {
        return items;
    }

    public void setItems(HashSet items) {
        this.items = items;
    }

    public Float getCoste() {
        return coste;
    }

    public void setCoste(Float coste) {
        this.coste = coste;
    }

    public void mostrarItems() {
        for (Item item: items) {

        }
    }
}
