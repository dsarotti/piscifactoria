package peces.tipos;

import propiedades.PecesDatos;
import tanque.Tanque;

public class Filtrador extends Pez {

    public Filtrador(PecesDatos datos, Boolean sexo) {
        super(datos, sexo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comer(Tanque<Pez> tanque) {
        // TODO Auto-generated method stub
        System.out.println("comiendo");
    }
}
