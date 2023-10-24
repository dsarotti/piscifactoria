package peces.especies.mar;

import peces.especies.Mar;
import peces.tipos.Carnivoro;
import propiedades.AlmacenPropiedades;

public class Besugo extends Carnivoro implements Mar {

    public Besugo(Boolean sexo) {
        super(AlmacenPropiedades.BESUGO, sexo);
    }
    
}
