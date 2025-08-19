/*ES Descripción:
Pide un entero n (0–20) y muestra n!.
Valida que sea 0 ≤ n ≤ 20 (para evitar desbordamiento en long).
EN Description:
Ask for an integer n (0–20) and print n!.
Validate 0 ≤ n ≤ 20 (to avoid overflow in long). */

import java.util.Scanner;

public class Ejercicio_20_Factorial_de_un_número {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Validación 0..20 (porque 21 no cabe en el long).
        do {
            System.out.println("Ingresa un entero n (0 a 20); ");
            n = sc.nextInt();
            if(n < 0 || n > 20) {
                System.out.println("Error: n debe estar entre 0 y 20.");
            }     
        }while (n < 0 || n > 20);

        long factorial = 1L;
        for(int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
        sc.close();
    }
}
