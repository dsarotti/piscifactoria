package peces.especies.rio;

import peces.especies.Rio;
import peces.tipos.Carnivoro;
import propiedades.AlmacenPropiedades;

public class Pejerrey extends Carnivoro implements Rio {

    public Pejerrey(Boolean sexo) {
        super(AlmacenPropiedades.PEJERREY, sexo);
    }

}
