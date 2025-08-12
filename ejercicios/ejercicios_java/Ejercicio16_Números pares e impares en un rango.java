/*/Ejercicio 16 – Números pares e impares en un rango / Even & Odd Numbers in a Range

🇪🇸 Descripción

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

🇬🇧 Description

Ask the user for two integers: start and end of the (inclusive) range. Print:

All even numbers in the range.

All odd numbers in the range.

Requirements

Validate that start ≤ end. If provided in reverse order, swap them or ask again.

Use a for loop to iterate over the range.

Use if with % to check even (n % 2 == 0) and odd (n % 2 != 0).

Handle invalid inputs with clear messages.

Steps (algorithm)

Read start and end from input.

If start > end, swap values.

Loop using for (int i = start; i <= end; i++).

If i % 2 == 0 → add to evens; else → to odds.

Print both lists. /* */

---

🧩 Código (Java)

import java.util;

public class Ejercicio16ParesImpares {
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

---

/* 🧪 Ejemplo de ejecución

Ingresa el número inicial: 2
Ingresa el número final: 10

Números pares:
2 4 6 8 10

Números impares:
3 5 7 9

✅ Notas

Si prefieres no intercambiar, puedes volver a pedir los valores hasta que inicio <= fin.

El rango es inclusive (incluye inicio y fin si aplican).

Puedes optimizar empezando el bucle en el primer par/impar del rango, pero aquí se prioriza legibilidad.

---

🧰 Cómo compilar y ejecutar

javac Ejercicio16ParesImpares.java
java Ejercicio16ParesImpares

 */
