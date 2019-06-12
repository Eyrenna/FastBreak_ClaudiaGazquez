package encinas.bebidas;

import encinas.cereales.Eyeholes;
import encinas.items.Bebida;

public class FleebJuice extends Bebida {

    //Atributos
    private String nombre = "FleebJuice";
    private Float pvp = 25.0f;
    private static FleebJuice fleebJuice = null;

    //Constructor
    private FleebJuice(String nombre, Float pvp) {
        this.nombre = nombre;
        this.pvp = pvp;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPvp() {
        return pvp;
    }

    public void setPvp(Float pvp) {
        this.pvp = pvp;
    }

    public static FleebJuice getFleebJuice(String nombre, Float pvp ) {
        fleebJuice = new FleebJuice(nombre, pvp);
        return fleebJuice;
    }

    public void setFleebJuice(FleebJuice eyeholes) {
        this.fleebJuice = fleebJuice;
    }
}
