package peces.especies.doble;

import peces.especies.Mar;
import peces.especies.Rio;
import peces.tipos.Carnivoro;
import propiedades.AlmacenPropiedades;

public class LubinaEuropea extends Carnivoro implements Rio,Mar {

    public LubinaEuropea(Boolean sexo) {
        super(AlmacenPropiedades.LUBINA_EUROPEA, sexo);
    }
}
