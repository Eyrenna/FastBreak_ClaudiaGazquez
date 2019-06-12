package encinas.domain;

import encinas.interfaces.Item;
import encinas.items.Bebida;
import encinas.items.Cereales;

import java.util.ArrayList;


public class Desayuno {

    //Atributos

    private ArrayList items = new ArrayList<Item>();
    private Float coste = null;

    //Constructor

    public Desayuno() {
    }

    //Getters $ Setters

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public Float getCoste() {
        return coste;
    }

    public void setCoste(Float coste) {
        this.coste = coste;
    }
}
