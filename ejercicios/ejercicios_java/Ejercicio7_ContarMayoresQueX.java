// Ejercicio 7 - Contar cuántos elementos son mayores que un número dedo
// Exercise 7 - Count how many element are greater than a given number

public class Ejercicio7_ContarMayoresQueX {
    public static void main(String[] args) {
        int[] numeros = { 12, 18, 5, 21, 30, 10 };
        int contador = 0;
        int valorReferencia = 15; // Número base para comparar

        // Recorremos el arreglo
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > valorReferencia) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " números mayores que " + valorReferencia);
    }
}
