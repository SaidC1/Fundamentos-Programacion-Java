//Ejercicio 9 - Encontrar el mayor y menor número en el arreglo
//Exercise 9 - Find the largest and smallest number in an array

public class Ejercicio9_MayorYMenorEnArreglo {

    public static void main(String[] args) {
        int[] numeros = { 15, 3, 27, 8, 42, 5 };

        // Asignamos el primer elemento como mayor y menor inicialmente
        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorremos el arreglo desde el segundo elemento
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

    }

}
