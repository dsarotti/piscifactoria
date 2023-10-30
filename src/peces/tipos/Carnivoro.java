package peces.tipos;

import peces.Pez;
import propiedades.PecesDatos;
import tanque.Tanque;

public abstract class Carnivoro extends Pez{

    //alimenta al pez
    public Carnivoro(PecesDatos datos, Boolean sexo) {
        super(datos, sexo);
    }

    @Override
    public void comer(Tanque<Pez> tanque){
        //comer carnivoro
    }
}
