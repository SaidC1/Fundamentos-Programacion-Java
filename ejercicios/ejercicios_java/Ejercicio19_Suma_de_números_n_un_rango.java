/*Pide al usuario dos números enteros (inicio y fin) y calcula la suma de todos los números en ese rango, inclusive.
Valida que el inicio sea menor o igual que el fin. */

/*Pide al usuario dos números enteros (inicio y fin) y calcula la suma de todos los números en ese rango, inclusive.
Valida que el inicio sea menor o igual que el fin. */

import java.util.Scanner;

public class Ejercicio19_Suma_de_números_n_un_rango {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número inicial: ");
        int inicio = sc.nextInt();

        System.out.print("Ingresa el número final: ");
        int fin = sc.nextInt();

        if (inicio > fin) {
            System.out.println("Error: el número inicial debe ser menor o igual al final.");
        } else {
            int suma = 0;
            for (int i = inicio; i <= fin; i++) {
                suma += i;
            }
            System.out.println("La suma de los números entre " + inicio + " y " + fin + " es: " + suma);
        }

        sc.close();
    }
}
