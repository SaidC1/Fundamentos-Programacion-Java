// Ejercicio 10 - Menú interactivo en consola 
// Exercise 10 - Interactive console menu

import java.util.Scanner;

public class Ejercicio10_MenuInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n MENÚ PRINCIPAL");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar la fecha actual");
            System.out.println("3. Decir un número aleatorio");
            System.out.println("0. Salir");
            System.out.println("Elige una opción.");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Hola, Irvin!");
                    break;
                case 2:
                    System.out.println("Hoy es: " + java.time.LocalDate.now());
                    break;
                case 3:
                    int aleatorio = (int) (Math.random() * 100 + 1);
                    System.out.println("Tu número aleatorio es: " + aleatorio);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("❌ Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
