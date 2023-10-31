package piscifactoria;
import java.util.ArrayList;

import peces.Pez;
import tanque.Tanque;

public abstract class Piscifactoria {
    private String nombre;
    ArrayList<Tanque<? extends Pez>> tanques;
    
    public void showStatus(){
        System.out.println("=============== nombre ===============");
        System.out.println("Tanques: " + tanques.size());
        System.out.println("Ocupación:  "+ getCuentaPeces() + " / "+getCapacidad() + " (" + getOcupacion()+ "%)");
        System.out.println("Peces vivos: "+ getVivos() + " / " + getCuentaPeces() + " (" + getPorcentajeVivos() + "%)");
        System.out.println("Peces alimentados: " + getAlimentados() + " / " + getVivos() + " (" + getPorcentajeAlimentados() + "%)");
        System.out.println("Peces adultos: adultos / vivos (x%)");
        System.out.println("Hembras / Machos: H/M");
        System.out.println("Fértiles: fértiles / vivos");
        System.out.println("Almacén de comida: actual / max (x%)");
    } 

    public String getNombre(){
        return nombre;
    }
    public int getCuentaPeces(){
        int cuenta=0;
        for (Tanque<? extends Pez> tanque : tanques) {
            cuenta= cuenta + tanque.getCantidadPeces();
        }
        return cuenta;
    }
    public int getCapacidad(){
        int cuenta = 0;
        for (Tanque<? extends Pez> tanque : tanques) {
            cuenta = cuenta+tanque.getCapacidad();
        }
        return cuenta;
    }
    public double getOcupacion(){
        int capacidad=getCapacidad();
        int ocupado=getCuentaPeces();
        return capacidad*ocupado/100;
    }
    public int getVivos(){
        int cuenta=0;
        for (Tanque<? extends Pez> tanque : tanques) {
            cuenta = cuenta + tanque.getVivos();
        }
        return cuenta;
    }
    public double getPorcentajeVivos(){
        int vivos = getVivos();
        int capacidad = getCapacidad();
        return capacidad * vivos / 100;
    }
    public int getAlimentados(){
        int cuenta = 0;
        for (Tanque<? extends Pez> tanque : tanques) {
            cuenta = cuenta + tanque.getAlimentados();
        }
        return cuenta;
    }
    public double getPorcentajeAlimentados(){
        int alimentados = getAlimentados();
        int vivos = getVivos();
        return alimentados * vivos / 100;
    }
    public int getIndiceTanque(Tanque<? extends Pez> tanque){
        return tanques.indexOf(tanque);
    }
}