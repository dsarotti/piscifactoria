package peces.especies.rio;

import peces.especies.Rio;
import peces.tipos.CarnivoroActivo;
import propiedades.AlmacenPropiedades;

public class PercaEuropea extends CarnivoroActivo implements Rio{

    public PercaEuropea(Boolean sexo) {
        super(AlmacenPropiedades.PERCA_EUROPEA, sexo);
    }
    
}
