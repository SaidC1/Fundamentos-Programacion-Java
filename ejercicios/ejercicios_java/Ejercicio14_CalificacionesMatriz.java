// Ejercicio 14 – Mostrar una tabla de calificaciones con arreglo bidimensional
// Exercise 14 – Display grade table using 2D array

public class Ejercicio14_CalificacionesMatriz {

    public static void main(String[] args) {
        // 3 alumnos y 3 materias
        int[][] calificaciones = {
            {85, 90, 78},   // Alumno 1
            {76, 88, 95},   // Alumno 2
            {92, 84, 89}    // Alumno 3
        };

        // Imprimir cabecera
        System.out.println("📊 Tabla de Calificaciones:");
        System.out.println("Alumno | Mate | Fisica | Programación");

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("   " + (i + 1) + "    | ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + "     | ");
            }
            System.out.println();
        }
    }
}
