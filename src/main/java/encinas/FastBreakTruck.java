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
        Smiggles smiggles = Smiggles.getSmiggles(Smiggles.getNombre,Smiggles.getPvp);
        FleebJuice fleebJuice = FleebJuice.getFleebJuice(FleebJuice.getNombre, FleebJuice.getPvp);
        desayuno.getItems().add(smiggles);
        desayuno.getItems().add(fleebJuice);
        return desayuno;
    }

    public static Desayuno prepararSmiggles(){
        Desayuno desayuno = new Desayuno();
        Eyeholes eyeholes = Eyeholes.getEyeholes(Eyeholes.getNombre, Eyeholes.getPvp);
        TurbulentJuice turbulentJuice = TurbulentJuice.getTurbulentJuice(TurbulentJuice.getNombre, TurbulentJuice.getPvp);
        desayuno.getItems().add(eyeholes);
        desayuno.getItems().add(turbulentJuice);
        return desayuno;
    }


}
