// Ejercicio 8 - Buscar un número dentro de un arreglo
// Exercise 8 - Search for a number inside an array

import java.util.Scanner;

public class Ejercicio8_BuscarNumeroEnArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = { 3, 7, 12, 19, 25, 30 };
        boolean encontrado = false;

        System.out.println("Ingresa el número que deseas buscar: ");
        int buscar = sc.nextInt();

        // Recorremos el arreglo buscando el número
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                encontrado = true;
                break; // Lo encontramos, salimos del ciclo
            }
        }

        // Mostramos el resultado
        if (encontrado) {
            System.out.println("El número " + buscar + " Sí se encontro en el arreglo.");
        } else {
            System.out.println("El número " + buscar + " NO se encuentra en el arreglo.");
        }

        sc.close();
    }
}
