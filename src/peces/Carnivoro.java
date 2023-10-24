package peces;

import propiedades.PecesDatos;
import tanque.Tanque;

public abstract class Carnivoro extends Pez{

    //alimenta al pez
    public Carnivoro(PecesDatos datos, Boolean sexo) {
        super(datos, sexo);
    }

    public void comer(Tanque<Carnivoro> tanque){
        
    }
}
