package peces.tipos;

import java.util.Random;

import propiedades.PecesDatos;
import tanque.Tanque;

public abstract class CarnivoroActivo extends Carnivoro {

    public CarnivoroActivo(PecesDatos datos, Boolean sexo) {
        super(datos, sexo);
        //TODO Auto-generated constructor stub
    }

    //Probabilidad de comer 2 veces
    private double probNoComer2=0.5;

  
    public void comer(Tanque<Pez> tanque) {
        Random r = new Random();
        if(r.nextDouble()<probNoComer2){
            //comer 2
        }else{
            //comer 1
        }
    }


}
