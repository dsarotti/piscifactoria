package peces.tipos;

import java.util.Random;

import peces.Pez;
import propiedades.PecesDatos;
import tanque.Tanque;

public abstract class CarnivoroActivo extends Carnivoro {

    //Probabilidad de comer 2 veces
    private final double probComer2=0.5;

    public CarnivoroActivo(PecesDatos datos, Boolean sexo) {
        super(datos, sexo);
        //TODO Auto-generated constructor stub
    }


    //TODO: prob. eliminar pez muerto: 50%
    public void comer(Tanque<Pez> tanque) {
        Random r = new Random();
        if(r.nextDouble()>probComer2){
            //comer 2 veces
        }else{
            //comer 1 vez
        }
    }


}
