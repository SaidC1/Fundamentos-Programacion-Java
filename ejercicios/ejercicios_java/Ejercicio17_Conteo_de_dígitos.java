/*Ejercicio 17 – Conteo de dígitos / Digit Count

---

🇪🇸 Descripción

Solicita al usuario un número entero (puede ser negativo) y muestra:

La cantidad de dígitos del número (ignorando el signo).

La suma de los dígitos.

(Opcional) Si el número es capicúa (palíndromo) ignorando el signo.

---

Requisitos

Validar entrada: solo enteros (pueden incluir -).

Ignorar el signo para el conteo de dígitos y la suma.

No usar conversión a double para evitar errores con números grandes; usar String, long o BigInteger.

---

Pasos (algoritmo)

Leer la entrada como String.

Validar que sea un entero válido (opcional: con expresión regular ^-?\d+$).

Si empieza con -, quitar el signo para procesar.

Contar length() para los dígitos y recorrer caracteres para sumar.

(Opcional) Verificar si el String sin signo es palíndromo.

---

🇬🇧 Description

Ask the user for an integer (it may be negative) and print:

The number of digits (ignoring the sign).

The sum of the digits.

(Optional) Whether it is a palindrome (ignoring the sign).

Requirements

Validate input: integers only (may include -).

Ignore the sign when counting and summing digits.

Avoid converting to double to prevent precision issues; use String, long, or BigInteger.

Steps (algorithm)

Read input as String.

Validate it's a valid integer (optionally via regex ^-?\d+$).

If it starts with -, remove the sign for processing.

Use length() for digit count and iterate chars to sum.

(Optional) Check palindrome for the unsigned string. 

---

*/

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio17_Conteo_de_dígitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        // Leer hasta que sea un entero válido (con signo no opcional)
        while (true) {
            System.out.print("Ingresa un número entero (puede ser negativo): ");
            input = sc.nextLine().trim();
            if (input.matches("-?\\+")) {
                break;
            } else {
                System.out.println("Entraa no válida. Escribe solo dígitos (y un '-' opcional). \n");
            }
        }

        boolean esNegativo = input.startsWith("-");
        String absStr = esNegativo ? input.substring(1) : input; // quitar signo

        // Manejo de número grande por si acaso
        BigInteger valor = new BigInteger(input);

        // Conteo de dígitos
        int cantidadDigitos = absStr.length();

        // Suma de dígitos
        int suma = 0;
        for (char c : absStr.toCharArray()) {
            suma += (c - '0');
        }

        // Palíndromo (capicúa)
        String reverso = new StringBuilder(absStr).reverse().toString();
        boolean esPalindromo = absStr.equals(reverso);

        // Salida
        System.out.println("\nNúmero ingresado: " + valor);
        System.out.println("Cantidad de dígitos (sin signo): " + cantidadDigitos);
        System.out.println("Suma de dígitos: " + suma);
        System.out.println("¿Es capicúa ? " + (esPalindromo ? "Sí" : "No"));

        sc.close();
    }
}

/* 🧪 Ejemplos de ejecución

Ingresa un número entero (puede ser negativo): -12030

Número ingresado: -12030
Cantidad de dígitos (sin signo): 5
Suma de dígitos: 6
¿Es capicúa? No

Ingresa un número entero (puede ser negativo): 1221

Número ingresado: 1221
Cantidad de dígitos (sin signo): 4
Suma de dígitos: 6
¿Es capicúa? Sí

---

✅ Notas

Si el usuario ingresa 0, la cantidad de dígitos es 1 y la suma es 0.

Usar BigInteger evita desbordamientos para valores muy grandes.

Si quieres evitar BigInteger, puedes trabajar únicamente con String.

---

🧰 Cómo compilar y ejecutar
javac Ejercicio17ConteoDigitos.java
java Ejercicio17ConteoDigitos

 */
