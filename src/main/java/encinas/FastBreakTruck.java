package encinas;

import encinas.bebidas.FleebJuice;
import encinas.bebidas.TurbulentJuice;
import encinas.cereales.Eyeholes;
import encinas.cereales.Smiggles;
import encinas.domain.Desayuno;
import encinas.interfaces.Item;

public class FastBreakTruck {

    //Constructor
    public FastBreakTruck() {
    }

    //Métodos
    public static Desayuno prepararEyeHoles(){
        Desayuno desayuno = new Desayuno();
        Item smiggles = new Smiggles();
        Item fleebJuice = new FleebJuice();
        desayuno.getItems().add(smiggles);
        desayuno.getItems().add(fleebJuice);
        return desayuno;
    }

    public static Desayuno prepararSmiggles(){
        Desayuno desayuno = new Desayuno();
        Item eyeholes = new Eyeholes();
        Item TurbulentJuice = new TurbulentJuice();
        desayuno.getItems().add(eyeholes);
        desayuno.getItems().add(TurbulentJuice);
        return desayuno;
    }


}
