package encinas.bebidas;

import encinas.items.Bebida;

public class TurbulentJuice extends Bebida {

    //Atributos
    private String nombre = "TurbulentJuice";
    private Float pvp = 25.0f;
    private static TurbulentJuice turbulentJuice = null;

    //Constructor
    private TurbulentJuice(String nombre, Float pvp) {
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

    public static TurbulentJuice getTurbulentJuice(String nombre, Float pvp ) {
        turbulentJuice = new TurbulentJuice(nombre, pvp);
        return turbulentJuice;
    }

    public void setTurbulentJuice(TurbulentJuice turbulentJuice) {
        this.turbulentJuice = turbulentJuice;
    }
}
