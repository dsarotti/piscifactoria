package tanque;

import java.util.ArrayList;

import peces.tipos.Pez;

public class Tanque<T extends Pez> {

    private int capacidad;
    private ArrayList<T> peces = new ArrayList<>();
    
    public void showStatus(){
        System.out.println("=============== Tanque # ===============");
        System.out.println("Ocupación: peces / max (x%)");
        System.out.println("Peces vivos: vivos / total (x%)");
        System.out.println("Peces alimentados: alimentados / vivos (x%)");
        System.out.println("Peces adultos: adultos / vivos (x%)");
        System.out.println("Hembras / Machos: H/M");
        System.out.println("Fértiles: fértiles / vivos");
    }

    //Muestra la información de todos los peces del tanque.
    public void showFishStatus(){

    }

    public void showCapacity(){

    }
}