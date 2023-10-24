package monedas;

public class Monedero {
    int monedas;

    public Monedero(int monedas) {
        this.monedas = monedas;
    }

    public boolean extraer(int cantidad){
        if (cantidad>monedas){
            return false;
        }else{
            monedas=-cantidad;
            return true;
        }
    }

    public int ingresar( int cantidad){
        monedas+=cantidad;
        return cantidad;
    }
}