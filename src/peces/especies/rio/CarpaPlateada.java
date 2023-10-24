package peces.especies.rio;

import peces.especies.Rio;
import peces.tipos.Filtrador;
import propiedades.AlmacenPropiedades;

public class CarpaPlateada extends Filtrador implements Rio {

    public CarpaPlateada(Boolean sexo) {
        super(AlmacenPropiedades.CARPA_PLATEADA, sexo);
    }
    
}
