package peces.especies.mar;

import peces.especies.Mar;
import peces.tipos.Carnivoro;
import propiedades.AlmacenPropiedades;

public class LubinaRayada extends Carnivoro implements Mar {

    public LubinaRayada(Boolean sexo) {
        super(AlmacenPropiedades.LUBINA_RAYADA, sexo);
    }
    
}
