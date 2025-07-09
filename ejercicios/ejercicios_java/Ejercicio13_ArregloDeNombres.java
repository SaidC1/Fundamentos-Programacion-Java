// Ejercicio 13 - Mostrar todos los nombres de un arreglo de String
// Exercise 13 - Print all names from a String array

public class Ejercicio13_ArregloDeNombres {

    public static void main(String[] args) {
        // Arreglo de nombres
        String[] nombres = { "Irvin", "Ana", "Luis", "Maria", "Pedro" };

        // Recorremos el arreglo e imprimimos cada nombre
        System.out.println("Lista de nombres: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("- " + nombres[i]);
        }
    }
}
