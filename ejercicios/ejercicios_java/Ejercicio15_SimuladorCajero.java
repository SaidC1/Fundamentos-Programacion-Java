// Ejercicio 15 – Simulación de un cajero automático
// Exercise 15 – ATM simulation in console

import java.util.Scanner;

public class Ejercicio15_SimuladorCajero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.0; // Saldo inicial
        int opcion;

        do {
            System.out.println("\n🏦 CAJERO AUTOMÁTICO");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("💰 Tu saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingresa la cantidad a depositar: $");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("✅ Depósito exitoso.");
                    } else {
                        System.out.println("❌ Cantidad no válida.");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa la cantidad a retirar: $");
                    double retiro = sc.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("✅ Retiro exitoso.");
                    } else {
                        System.out.println("❌ No tienes suficiente saldo o el monto es inválido.");
                    }
                    break;
                case 0:
                    System.out.println("👋 Gracias por usar el cajero. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
