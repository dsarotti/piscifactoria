package sim;

import java.util.ArrayList;
import java.util.Scanner;

import almacen.AlmacenCentral;
import monedas.Monedero;
import peces.Pez;
import piscifactoria.Piscifactoria;
import piscifactoria.PiscifactoriaRio;

/**
 * Simulación de una piscifactoría
 * 
 * @param dia            el número de días que han pasado
 * @param piscifactorias las piscifactorias que hay
 * @param empresa        nombre de la empresa
 * @param monedas        el numero de créditos actuales
 */
public class Simulador {
    private static Simulador sim;
    // TODO: Implementar main, menú y la lógica general

    private static Scanner sc;
    private int dia = 0;
    private ArrayList<Piscifactoria> piscifactorias;
    private AlmacenCentral almacenCentral;
    private String empresa;
    // TODO: convertir en clase Monedero con sus métodos.
    private Monedero monedero;

    public void init() {
        sc = new Scanner(System.in);

        // TODO: crear todos los objetos necesarios

        String nombreEmpresa = "";
        String primeraPiscifactoria = "";
        piscifactorias=new ArrayList<Piscifactoria>();

        // Solicita nombre de empresa y piscifactoría, no deben ser strings vacíos.
        while (nombreEmpresa.isBlank()) {
            System.out.println("Introduzca el nombre de la empresa: ");
            nombreEmpresa = sc.nextLine();
        }

        while (primeraPiscifactoria.isBlank()) {
            System.out.println("Introduzca el nombre de la primera piscifactoría: ");
            primeraPiscifactoria = sc.nextLine();
        }

        empresa = nombreEmpresa;

        piscifactorias.add(new PiscifactoriaRio(primeraPiscifactoria));

        monedero = new Monedero(100);

        piscifactorias.get(0).showStatus();
    }

    public static void menu() {
        // TODO: llevar el switch a otro método.
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer del teclado
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionó Estado general");
                    break;
                case 2:
                    System.out.println("Seleccionó Estado piscifactoría");
                    break;
                case 3:
                    System.out.println("Seleccionó Estado tanques");
                    break;
                case 4:
                    System.out.println("Seleccionó Informes");
                    break;
                case 5:
                    System.out.println("Seleccionó Ictiopedia");
                    break;
                case 6:
                    System.out.println("Seleccionó Pasar día");
                    break;
                case 7:
                    System.out.println("Seleccionó Comprar comida");
                    break;
                case 8:
                    System.out.println("Seleccionó Comprar peces");
                    break;
                case 9:
                    System.out.println("Seleccionó Vender peces");
                    break;
                case 10:
                    System.out.println("Seleccionó Limpiar tanques");
                    break;
                case 11:
                    System.out.println("Seleccionó Vaciar tanque");
                    break;
                case 12:
                    System.out.println("Seleccionó Mejorar");
                    break;
                case 13:
                    System.out.println("Seleccionó Pasar varios días");
                    break;
                case 14:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 14);
        sc.close();
    }

    /**
     * Imprime por la salida estandar las opciones disponibles en el menú principal
     */
    public static void mostrarMenu() {
        System.out.println("Menú Principal\n");
        System.out.println("1. Estado general");
        System.out.println("2. Estado piscifactoría");
        System.out.println("3. Estado tanques");
        System.out.println("4. Informes");
        System.out.println("5. Ictiopedia");
        System.out.println("6. Pasar día");
        System.out.println("7. Comprar comida");
        System.out.println("8. Comprar peces");
        System.out.println("9. Vender peces");
        System.out.println("10. Limpiar tanques");
        System.out.println("11. Vaciar tanque");
        System.out.println("12. Mejorar");
        System.out.println("13. Pasar varios días");
        System.out.println("14. Salir");
        System.out.println();
    }

    public void menuPisc() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Seleccione una opción:");
        System.out.println("--------------------------- Piscifactorías ---------------------------");
        System.out.println("[Peces vivos / Peces totales / Espacio total]");

        // TODO: cambiar por los valores reales.
        // TODO: Cambiar Object por la clase implementada.
        // TODO: x = index + 1.
        for (Object piscifactoria : this.piscifactorias) {
            System.out.println("x.- Nombre [vivos/total/espacio]");
        }
        System.out.println("- 0: Cancelar");

        do {
            opcion = sc.nextInt();
        } while (opcion > 14 || opcion < 0);
    }

    // Muestra el menú de piscifactorías y permite seleccionar una de ellas,
    // devolviendo
    // la opción seleccionada.
    // TODO: devolver una piscifactoria en lugar de Object
    public Object selectPisc() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            menuPisc();
            opcion = scanner.nextInt();
        } while (opcion < 0 || opcion > this.piscifactorias.size());
        scanner.close();

        if (opcion == 0) {
            return null;
        } else {
            return piscifactorias.get(opcion - 1);
        }
    }
}