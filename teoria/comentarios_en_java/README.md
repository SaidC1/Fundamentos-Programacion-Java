# 📝 Comentarios en Java / Comments in java

Los comentarios pérmiten agregar notas en el código que no se ejecutan.
Comments let you add notes in the code that are not executed.

---

## 💬 Tipos de comentarios / Types of comments 

### 1. Comentario de una línea
### 1. Single-line comment

```java

// Este es un comentario de una sola línea
// This is a single-line comment
System.out.println("Hola mundo"); // Comentario al final de la línea

---

### 2. Comentario de varias líneas
### 2. Multi-line comment

/*
Este es un comentario 
de varias líneas.
This is a multi-line
comment block-
*/

System.out.println("Hola mundo");

/**
 * Este método suma dos números.
 * This method adds two numbers.
 * @param a Primer número / First number
 * @param b Segundo número / Second number
 * @return La suma / The sum
 */

public static int sumar(int a, int b) {
    return a + b;
}


---

✅ Buenas prácticas / Best practices
✅ Usa comentarios para explicar "el por qué", no solo "el qué".
Use comments to explain why, not just what.

✅ No abuses de los comentarios innecesarios.
Avoid overcommenting obvious code.

✅ Comenta bloques complejos o fórmulas.
Comment complex logic or calculations.

✅ Usa comentarios para dividir secciones del código.
Use comments to separate code sections.

Ejemplo de buenas prácticas

// Calcular el promedio de 3 calificaciones
// Calculate the average of 3 grades

int suma = 85 + 90 + 78;
double promedio = suma  / 3.0;

System.out.println("Promedio " + promedio);

👉 Los comentarios hacen tu código más entendible, limpio y profesional.
👉 Comments make your code more understandable, clean, and professional.

