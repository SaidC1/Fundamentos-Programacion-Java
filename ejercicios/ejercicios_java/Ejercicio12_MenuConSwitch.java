// Ejercicio 12 - Menú interactivo con switch
// Exercise 12 - Interactive menu using switch

import java.util.Scanner;

public class Ejercicio12_MenuConSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENÚ");
        System.out.println("1. Saludar");
        System.out.println("2. Calcular 5 x 8");
        System.out.println("3. Mostrar tu nombre");
        System.out.println("Elige una opción (1-3): ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¡Hola, Irvin!");
                break;
            case 2:
                System.out.println("5 x 8 = " + (5 * 8));
                break;
            case 3:
                System.out.println("Tu nombre es: Irvin");
                break;
            default:
                System.out.println("❌ Opción no válida.");
        }
        sc.close();
    }
}
