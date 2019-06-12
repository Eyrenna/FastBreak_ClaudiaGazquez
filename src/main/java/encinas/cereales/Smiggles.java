package encinas.cereales;

import encinas.items.Cereales;

public class Smiggles extends Cereales {

    //Atributos
    private String nombre = "smiggles";
    private Float pvp = 50.0f;
    private static Smiggles smiggles = null;

    //Constructor
    private Smiggles(String nombre, Float pvp) {
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

    public static Smiggles getSmiggles(String nombre, Float pvp ) {
        smiggles = new Smiggles(nombre, pvp);
        return smiggles;
    }

    public void setSmiggles(Smiggles smiggles) {
        this.smiggles = smiggles;
    }
}
