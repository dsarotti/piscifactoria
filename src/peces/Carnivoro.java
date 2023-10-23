package peces;

import propiedades.PecesDatos;

public abstract class Carnivoro extends Pez{

    //alimenta al pez
    public Carnivoro(PecesDatos datos, Boolean sexo) {
        super(datos, sexo);
    }

    public void comer(){
    }
}
