package peces;
import java.util.Random;
import propiedades.AlmacenPropiedades;
import propiedades.PecesDatos;

/**
 * Clase padre de los peces.
 * 
 */
public abstract class Pez {
    protected int edad=0;
    protected Boolean sexo;
    protected Boolean vivo=true;
    protected Boolean alimentado=true;
    protected PecesDatos datos;

    public Pez(PecesDatos datos,Boolean sexo) {
        this.sexo = sexo;
        this.datos = datos;

    }


    public void showStatus(){
       System.out.println( "--------------- Nombre ---------------" );
       System.out.println( "Edad: " + edad + " días" );
       System.out.println( "Sexo: " + ( sexo?"M":"H" ) );
       System.out.println( "Vivo: " + ( vivo?"Si":"No" ) );
       System.out.println( "Alimentado: " + ( alimentado?"Si":"No" ) );
       System.out.println( "Adulto: " + ( edad>=datos.getMadurez()?"Si":"No" ) );
       System.out.println( "Fértil: " + ( (edad>=datos.getMadurez()&&alimentado)?"Si":"No" ) );
    }

    public void grow(){
        if (vivo){
            // TODO: alimentarse
            // alimentado == Piscifactoria.alimentar(cantidad)

            if(!alimentado){
                Random r = new Random();
                if (r.nextBoolean()){
                    vivo=false;
                    return;
                }
            }
            edad++;
        }

    }

    public Boolean getVivo() {
        return vivo;
    }
    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Boolean getSexo() {
        return sexo;
    }

}
