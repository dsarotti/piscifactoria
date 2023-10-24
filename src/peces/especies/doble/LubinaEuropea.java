package peces.especies.doble;

import peces.especies.Mar;
import peces.especies.Rio;
import peces.tipos.Carnivoro;
import propiedades.PecesDatos;

public class LubinaEuropea extends Carnivoro implements Rio,Mar {

    public LubinaEuropea(PecesDatos datos, Boolean sexo) {
        super(datos, sexo);
        //TODO Auto-generated constructor stub
    }
}
