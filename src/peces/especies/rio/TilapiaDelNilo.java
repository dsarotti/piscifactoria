package peces.especies.rio;

import peces.especies.Rio;
import peces.tipos.Filtrador;
import propiedades.AlmacenPropiedades;

public class TilapiaDelNilo extends Filtrador implements Rio {

    public TilapiaDelNilo(Boolean sexo) {
        super(AlmacenPropiedades.TILAPIA_NILO, sexo);
    }
}