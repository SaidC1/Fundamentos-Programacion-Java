// Ejercicio 3 - Sumar dos números usando un método
// Exercise 3 - Sum two numbers using a method

import java.util.Scanner;

public class Ejercicio3_SumaConMetodo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos los dos números al usuario
        System.out.println("Ingresa el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        // Llamamos al método sumar y guardamos el resultado
        int resultado = sumar(num1, num2);

        // Mostramos el resultado
        System.out.println("La suma es: " + resultado);

        sc.close();
    }

    // Método que recibe dos enteros y devuelve su suma
    public static int sumar(int a, int b) {
        return a + b;
    }

}
