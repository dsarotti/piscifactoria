package peces.especies.rio;

import peces.especies.Rio;
import peces.tipos.Carnivoro;
import propiedades.AlmacenPropiedades;

public class SalmonChinook extends Carnivoro implements Rio{

    public SalmonChinook(Boolean sexo) {
        super(AlmacenPropiedades.SALMON_CHINOOK, sexo);
    }
    
}
