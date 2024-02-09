package ejercicios;

import java.util.*;

public class Ejercicio2 {
    /**
     * Encontrar el máximo número de una lista
     *
     */
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de números a ingresar:");
        int cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Número " + (i + 1) + ":");
            numeros.add(sc.nextInt());
        }
        int maximoNumero = Collections.max(numeros);
        System.out.println("Máximo número: " + maximoNumero);
    }
}
