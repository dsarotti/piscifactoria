package almacen;
/**
 * Clase que representa el almacén central. Este permite almacenar comida en él para ser
 * distribuida equitativamente entre las piscifactorías cuando se compra la comida o se pasa un
 * día.
 * Inicialmente tiene una capacidad de 200 unidades
 */


public class AlmacenCentral {
    public static final int precio = 2000;
    public static final int precioMejora = 100;
    int comida = 200;

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public void añadirComida(int comida) {
        this.comida=+comida;
    }

    public void sustraerComida(int comida) {
        this.comida = comida;
    }
}
