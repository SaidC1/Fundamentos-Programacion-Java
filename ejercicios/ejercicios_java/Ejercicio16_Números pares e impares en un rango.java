/*/zEjercicio 16 – Números pares e impares en un rango / Even & Odd Numbers in a Range


Pide al usuario dos números enteros: inicio y fin del rango (inclusive). Muestra por pantalla:

Todos los números pares del rango.

Todos los números impares del rango.

Requisitos

Validar que el número inicial sea menor o igual que el final. Si el usuario los ingresa al revés, puedes intercambiarlos o pedir de nuevo.

Usar un ciclo for para recorrer el rango.

Usar if con el operador módulo % para separar par (n % 2 == 0) e impar (n % 2 != 0).

Manejar entradas no válidas con mensajes claros.

Pasos (algoritmo)

Leer inicio y fin del teclado.

Si inicio > fin, intercambiar valores.

Recorrer con for (int i = inicio; i <= fin; i++).

Si i % 2 == 0 → agregar a pares; si no → a impares.

Imprimir los dos listados.
 /* */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio16_Números_pares_e_impares_en_un_rango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer inicio = null, fin = null;

        // Lectura segura de enteros
        while (inicio == null) {
            System.out.print("Ingresa el número inicial: ");
            if (sc.hasNextInt()) {
                inicio = sc.nextInt();
            } else {
                System.out.println("Entrada no válida. Debes ingresar un entero.");
                sc.next();
            }
        }

        while (fin == null) {
            System.out.print("Ingresa el número final: ");
            if (sc.hasNextInt()) {
                fin = sc.nextInt();
            } else {
                System.out.println("Entrada no válida. Debes ingresar un entero.");
                sc.next();
            }
        }

        // Asegurar inicio <= fin
        if (inicio > fin) {
            int temp = inicio;
            inicio = fin;
            fin = temp;
            System.out.println("(Nota) Los valores se ingresaron al revés. Se han intercambiado.");
        }

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            } else {
                impares.add(i);
            }
        }

        System.out.println("\nNúmeros pares:");
        if (pares.isEmpty()) {
            System.out.println("(ninguno)");
        } else {
            for (int n : pares) System.out.print(n + " ");
            System.out.println();
        }

        System.out.println("\nNúmeros impares:");
        if (impares.isEmpty()) {
            System.out.println("(ninguno)");
        } else {
            for (int n : impares) System.out.print(n + " ");
            System.out.println();
        }

        sc.close();
    }
}


