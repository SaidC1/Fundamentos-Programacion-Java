# 🔁 Bucles Anidados en Java / Nested Loops in Java

Un **bucle anidado** es un ciclo dentro de otro ciclo.  
A **nested loop** is a loop inside another loop.

Se usan cuando necesitas repetir una acción **en varias dimensiones**, como imprimir una tabla, recorrer una matriz, o dibujar patrones.  
They are useful when you need to repeat actions **in multiple dimensions**, like printing tables, iterating matrices, or drawing patterns.

---

## ✅ Sintaxis general / General Syntax

```java
for (int i = 0; i < fila; i++) {
    for (int j = 0; j < columna; j++) {
        // Código a ejecutar
    }
}

while (condición1) {
    while (condición2) {
        // Código anidado
    }
}

---

🔹 Ejemplo 1: Tabla de multiplicar / Multiplication Table

for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 5; j++) {
        System.out.print(i * j + "\t");
    }
    System.out.print();
}

1	2	3	4	5
2	4	6	8	10
3	6	9	12	15

🔹 Ejemplo 2: Imprimir un rectángulo de asteriscos / Print a rectangle of asterisks

for (int fila = 1; fila <= 4; fila++) {
    for (int col = 1; col <= 6; col++) {
        System.out.print("*");
    }
    System.out.println();
}

******
******
******
******

---

🧠 Tips importantes / Important Tips
El bucle exterior controla las filas / the outer loop controls rows

El bucle interior controla las columnas / the inner loop controls columns

Puedes anidar for, while o do-while

Puedes usar break y continue dentro de bucles anidados

---

🔍 Uso común / Common Uses
Tablas de multiplicar

Dibujar figuras con asteriscos

Recorrer matrices bidimensionales

Crear menús o repeticiones anidadas