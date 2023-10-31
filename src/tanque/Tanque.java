package tanque;

import java.util.ArrayList;

import peces.Pez;

public class Tanque<T extends Pez> {

    private int capacidad;
    private ArrayList<Pez> peces = new ArrayList<>();
    
    public void showStatus(){
        System.out.println("=============== Tanque # ===============");
        System.out.println("Ocupación: " + peces.size() + " / " + capacidad + " (" + peces.size() * capacidad / 100 + "%)");
        System.out.println("Peces vivos: " + getVivos() + " / " + peces.size() + " (" + peces.size() * getVivos() / 100 + "%)");
        System.out.println("Peces alimentados: " + getAlimentados() + " / " + getVivos() + " (" + getAlimentados() * getVivos() / 100 +"%)");
        System.out.println("Peces adultos: " + getAdultos() +" / " + getVivos() + " (" + getAdultos() * getVivos() / 100 +"%)");
        System.out.println("Hembras / Machos: " + getHembras() + "/" + getMachos());
        System.out.println("Fértiles: fértiles / vivos");
    }

    //Muestra la información de todos los peces del tanque.
    public void showFishStatus(){
        
    }

    public void showCapacity(){

    }

    public int getCantidadPeces(){
        return peces.size();
    }
    public int getCapacidad(){
        return capacidad;
    }
    public int getVivos(){
        int cuenta =0;
        for (Pez pez : peces) {
           if(pez.isVivo()) cuenta++;
        }
        return cuenta;
    }
    public int getAlimentados(){
        int cuenta = 0;
        for (Pez pez : peces) {
            if (pez.isAlimentado()) cuenta++;
        }
        return cuenta;
    }
    public int getAdultos(){
        int cuenta = 0;
        for (Pez pez : peces) {
            if (pez.getEdad()>=pez.getDatos().getMadurez()) cuenta++;
        }
        return cuenta;
    }
    public int getHembras(){
        int cuenta=0;
        for (Pez pez : peces) {
            if (!pez.getSexo())cuenta++;
        }
        return cuenta;
    }
    public int getMachos(){
        int cuenta=0;
        for (Pez pez : peces) {
            if (pez.getSexo())cuenta++;
        }
        return cuenta;
    }

    public int getFertiles(){
        int cuenta = 0;
        for (Pez pez : peces) {
            if (pez.getCiclo()==0) cuenta++;
        }
        return cuenta;
    }

}