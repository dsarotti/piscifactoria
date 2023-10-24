package peces.especies.mar;

import peces.especies.Mar;
import peces.tipos.Filtrador;
import propiedades.AlmacenPropiedades;

public class ArenqueDelAtlantico extends Filtrador implements Mar {

    public ArenqueDelAtlantico(Boolean sexo) {
        super(AlmacenPropiedades.ARENQUE_ATLANTICO, sexo);
    }
    
}
