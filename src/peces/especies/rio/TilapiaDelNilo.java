package peces.especies.rio;

import peces.especies.Rio;
import peces.tipos.Filtrador;
import propiedades.PecesDatos;

public class TilapiaDelNilo extends Filtrador implements Rio {

    public TilapiaDelNilo(PecesDatos datos, Boolean sexo) {
        super(datos, sexo);
    }
}