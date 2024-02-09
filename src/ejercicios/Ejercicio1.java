package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    /**
     * Crear una lista de ventas y decir cuantas y cuales son mayores a S/.2000
     */
    public static void main(String[] args) {
        double ventas[] = new double[6];
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingrese las 30 ventas del mes:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta " + (i + 1) + ":");
            ventas[i] = scanner.nextDouble();
        }
        System.out.println("Ventas mayores a S/.2000:");
        System.out.println("------ ------- - --------");
        for (int j = 0; j < ventas.length; j++) {
            if (ventas[j] > 2000) {
                System.out.println("- Venta " + (j + 1) + ": S/." + ventas[j]);
                contador++;
            }
        }
        System.out.println("Hay " + contador + " ventas mayores a S/.2000");
    }
}
