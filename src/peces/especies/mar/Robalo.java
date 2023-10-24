package peces.especies.mar;

import peces.especies.Mar;
import peces.tipos.Carnivoro;
import propiedades.AlmacenPropiedades;

public class Robalo extends Carnivoro implements Mar {

    public Robalo(Boolean sexo) {
        super(AlmacenPropiedades.ROBALO, sexo);
    }
    
}
