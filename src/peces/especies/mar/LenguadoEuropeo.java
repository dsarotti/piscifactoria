package peces.especies.mar;

import peces.especies.Mar;
import peces.tipos.Carnivoro;
import propiedades.AlmacenPropiedades;

public class LenguadoEuropeo extends Carnivoro implements Mar{

    public LenguadoEuropeo( Boolean sexo) {
        super(AlmacenPropiedades.LENGUADO_EUROPEO, sexo);
    }
}
