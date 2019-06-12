package encinas.cereales;

import encinas.items.Cereales;

public class Eyeholes extends Cereales {

    //Atributos
    private String nombre = "eyeholes";
    private Float pvp = 25.0f;
    private static Eyeholes eyeholes = null;

    //Constructor
    private Eyeholes(String nombre, Float pvp) {
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

    public static Eyeholes getEyeholes(String nombre, Float pvp ) {
        eyeholes = new Eyeholes(nombre, pvp);
        return eyeholes;
    }

    public void setEyeholes(Eyeholes eyeholes) {
        this.eyeholes = eyeholes;
    }
}

