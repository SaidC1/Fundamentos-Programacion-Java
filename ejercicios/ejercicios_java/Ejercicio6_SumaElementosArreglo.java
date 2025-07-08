// Ejercicio 6 - Sumar todos los elementos de un arreglo
// Exercise 6 - Sum all elements in an array

public class Ejercicio6_SumaElementosArreglo {
    public static void main(String[] args) {
        int[] numeros = { 5, 10, 15, 20, 25 }; // Arreglo de ejemplo
        int suma = 0;

        // Recorremos el arreglo y vamos sumando
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i]; // Acumulamos el valor
        }

        System.out.println("La suma de todos los elementos es: " + suma);
    }

}
