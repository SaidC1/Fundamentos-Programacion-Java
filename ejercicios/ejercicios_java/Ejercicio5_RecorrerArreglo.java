// Ejercicio 5 - Recorrer un arreglo e imprimir sus valores
// Exercise 5 - Loop through an array and print its values

public class Ejercicio5_RecorrerArreglo {
    
    public static void main(String[]args) {
        // Declaramos un arreglo de enteros con 5 valores
        int[] numeros = {10, 20, 30, 40, 50};

        // Recorremos el arreglo usando un ciclo for
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en posición " + i + ": " + numeros[i]);
        }
    } 
}
