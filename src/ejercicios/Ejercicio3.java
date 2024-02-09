package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Aplicar descuentos:
     * Cada pieza de pan cuesta S/5
     * Si se piden más de 50 piezas, cada pieza cuesta S/4.5
     * Si se piden más de 100 piezas, cada pieza cuesta S/4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioTotal = 0;
        System.out.println("Ingrese cantidad de piesaz de pan que desea:");
        int cantidad = sc.nextInt();
        if (cantidad < 0) {
            System.out.println("Ingrese un número correcto");
        } else if (cantidad <= 50) {
            precioTotal = cantidad * 5;
        } else if (cantidad <= 100) {
            precioTotal = cantidad * 4.5;
        } else {
            precioTotal = cantidad * 4;
        }
        System.out.println("El precio total es de: S/." + precioTotal);
    }
}
