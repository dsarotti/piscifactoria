package peces.tipos;

import java.util.Random;

import peces.Pez;
import propiedades.PecesDatos;
import tanque.Tanque;

public class Filtrador extends Pez {

    private final double probNoComer=0.5;

    public Filtrador(PecesDatos datos, Boolean sexo) {
        super(datos, sexo);
        //TODO Auto-generated constructor stub
    }

    @Override
    //TODO: prob. No comer: 50%
    public void comer(Tanque<Pez> tanque) {
        Random r = new Random();
        if(r.nextDouble()>probNoComer){
            //No come
        }else{
            //Come
        }
    }
}
