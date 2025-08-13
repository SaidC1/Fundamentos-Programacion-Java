/*Ejercicio 17 – Conteo de dígitos / Digit Count

🇪🇸 Descripción

Solicita al usuario un número entero (puede ser negativo) y muestra:

La cantidad de dígitos del número (ignorando el signo).

La suma de los dígitos.

(Opcional) Si el número es capicúa (palíndromo) ignorando el signo.

Requisitos

Validar entrada: solo enteros (pueden incluir -).

Ignorar el signo para el conteo de dígitos y la suma.

No usar conversión a double para evitar errores con números grandes; usar String, long o BigInteger.

Pasos (algoritmo)

Leer la entrada como String.

Validar que sea un entero válido (opcional: con expresión regular ^-?\d+$).

Si empieza con -, quitar el signo para procesar.

Contar length() para los dígitos y recorrer caracteres para sumar.

(Opcional) Verificar si el String sin signo es palíndromo.

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

(Optional) Check palindrome for the unsigned string. */
