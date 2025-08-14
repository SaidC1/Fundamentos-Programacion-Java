/*Pide al usuario un número entero positivo y muestra la cantidad de dígitos que tiene.
Valida que el número sea positivo antes de continuar.

Ask the user for a positive integer and display how many digits it has.
Validate that the number is positive before continuing.

*/

import java.util.Scanner;

public class Ejercicio18_Contar_dígitos_de_un_número {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        // Valor número positivo
        do {
            System.out.println("Ingres un número entero positivo: ");
            numero = sc.nextInt();
            if (numero <= 0) {
                System.out.println("Erro: el número debe ser positivo.");
            }
        } while (numero <= 0);
