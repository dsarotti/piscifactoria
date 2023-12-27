package tanque;

import java.util.ArrayList;

import peces.Pez;
import piscifactoria.Piscifactoria;

public class Tanque<T extends Pez> {

    private int capacidad;
    private ArrayList<Pez> peces = new ArrayList<>();
    // Piscifactoría a la que pertenece el tanque
    private Piscifactoria piscifactoria;

    
    
    public Tanque(int capacidad, Piscifactoria piscifactoria) {
        this.capacidad = capacidad;
        this.piscifactoria = piscifactoria;
    }

    public void showStatus(){
        System.out.println("=============== Tanque # ===============");
        System.out.println("Ocupación: " + peces.size() + " / " + capacidad + " (" + peces.size() * capacidad / 100 + "%)");
        System.out.println("Peces vivos: " + getVivos() + " / " + peces.size() + " (" + peces.size() * getVivos() / 100 + "%)");
        System.out.println("Peces alimentados: " + getAlimentados() + " / " + getVivos() + " (" + getAlimentados() * getVivos() / 100 +"%)");
        System.out.println("Peces adultos: " + getAdultos() +" / " + getVivos() + " (" + getAdultos() * getVivos() / 100 +"%)");
        System.out.println("Hembras / Machos: " + getHembras() + "/" + getMachos());
        System.out.println("Fértiles: " + getFertiles() + " / " + getVivos());
    }

    
    /**
     * Muestra la información de cada pez del tanque.
     */
    public void showFishStatus(){
        for (Pez pez : peces) {
            pez.showStatus();
        }
    }

    /**
     * Muestra la ocupación del tanque
     */
    public void showCapacity(){
        int numeroTanque = piscifactoria.getIndiceTanque(this);
        String nombre = piscifactoria.getNombre();
        double porcentajeCapacidad = capacidad * peces.size() / 100.0;

        System.out.println("Tanque " + numeroTanque + " de la piscifactoría " + nombre + " al " + porcentajeCapacidad + "% de capacidad. [" + peces.size() + "/" + capacidad + "]");
    }

    
    /** 
     * @return int el número de peces en el tanque (vivos y muertos).
     */
    public int getCantidadPeces(){
        return peces.size();
    }
    
    /** 
     * @return int capacidad del tanque
     */
    public int getCapacidad(){
        return capacidad;
    }
    
    /** 
     * @return int el número de peces vivos en el tanque
     */
    public int getVivos(){
        int cuenta =0;
        for (Pez pez : peces) {
           if(pez.isVivo()) cuenta++;
        }
        return cuenta;
    }
    
    /** 
     * @return int el número de alimentados en el tanque.
     */
    public int getAlimentados(){
        int cuenta = 0;
        for (Pez pez : peces) {
            if (pez.isAlimentado()) cuenta++;
        }
        return cuenta;
    }
    
    /** 
     * @return int el núumero de adultos en el tanque
     */
    public int getAdultos(){
        int cuenta = 0;
        for (Pez pez : peces) {
            if (pez.getEdad()>=pez.getDatos().getMadurez()) cuenta++;
        }
        return cuenta;
    }
    
    /** 
     * @return int el número de hembras en el tanque
     */
    public int getHembras(){
        int cuenta=0;
        for (Pez pez : peces) {
            if (!pez.getSexo())cuenta++;
        }
        return cuenta;
    }
    
    /** 
     * @return int el número de machos en el tanque
     */
    public int getMachos(){
        int cuenta=0;
        for (Pez pez : peces) {
            if (pez.getSexo())cuenta++;
        }
        return cuenta;
    }

    
    /** 
     * @return int el número de peces fértiles del tanque 
     */
    public int getFertiles(){
        //TODO: aclarar qué define un pez fértil.
        int cuenta = 0;
        for (Pez pez : peces) {
            if (pez.getCiclo()==0) cuenta++;
        }
        return cuenta;
    }

    public void nextDay(){
        for (Pez pez : peces) {
            pez.grow();
        }
        for (Pez pez : peces) {
            //TODO: realizar proceso de reproducción.
        }
    }
}