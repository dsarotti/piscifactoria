package peces.especies.doble;

import peces.especies.Mar;
import peces.especies.Rio;
import peces.tipos.Carnivoro;
import propiedades.AlmacenPropiedades;

public class TruchaArcoiris extends Carnivoro implements Mar,Rio {

    public TruchaArcoiris(Boolean sexo) {
        super(AlmacenPropiedades.TRUCHA_ARCOIRIS, sexo);
    }

}
