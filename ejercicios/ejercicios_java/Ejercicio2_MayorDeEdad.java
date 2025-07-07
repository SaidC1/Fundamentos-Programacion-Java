// Ejercicio 2 - Verificar si una persona es mayor de edad 
// Exercise 2 - Check if a person is of legar age

import java.util.Scanner;

public class Ejercicio2_MayorDeEdad {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        // Solicitamos la edad al usuario
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();

        // Verificamos si es mayor o menor de edad
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        sc.close();
    }

}
