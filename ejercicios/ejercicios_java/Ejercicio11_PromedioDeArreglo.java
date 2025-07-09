// Ejercicio 11 - Calcular el promedio de un arreglo usando un método
// Exercise 11 - Calculate the average of an array using a method

public class Ejercicio11_PromedioDeArreglo {
    public static void main(String[] args) {
        int[] calificaciones = { 85, 90, 78, 92, 88 }; // Ejemplo de arreglo

        double promedio = calcularPromedio(calificaciones);

        System.out.println("El promedio es: " + promedio);
    }

    // Método que recibe un arreglo y devuelve el promedio
    public static double calcularPromedio(int[] arreglo) {
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        return (double) suma / arreglo.length;
    }
}