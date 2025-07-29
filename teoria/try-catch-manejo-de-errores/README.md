# ⚠️ Try-Catch y Manejo de Errores en Java / Error Handling in Java.

En Java, cuando ocurre un **error en tiempo de ejecución (Runtime Error)**, el programa se detiene.  
Para evitarlo, usamos **try-catch** para **atrapar y manejar errores**.  

In Java, when a **runtime error** occurs, the program stops.  
To prevent this, we use **try-catch** to **catch and handle errors**.

---

## ✅ 1. Tipos de errores en Java

1. **Errores de compilación (Syntax errors)**  
   - Ejemplo: olvidar `;` o escribir mal una palabra clave.  

2. **Errores lógicos (Logic errors)**  
   - El programa corre, pero da resultados incorrectos.  

3. **Errores en tiempo de ejecución (Runtime errors)**  
   - Ejemplo: dividir por cero, índice fuera de rango, archivo inexistente.  

El **try-catch** solo maneja **errores en tiempo de ejecución**.

---

## ✅ 2. Sintaxis básica.

```java
try {
    // Código que podría causar un error
} catch (TipoDeExcepcion e) {
    // Código para manejar el error
}

## ✅ 3. Ejemplo básico

public class EjemploTryCatch {
    public static void main(String[]args) {
        try {
            int resultado = 10 / 0 ; // Esto genera ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("❌ Error: No se puede dividir entre cero")
        }
        System.out.println("El programa sigue funcionando...")
    }
}

Salida / Output:

❌ Error: No se puede dividir entre cero
El programa sigue funcionando...

📌 Sin el try-catch, el programa se detendría.

---

✅ 4. Capturar múltiples errores
Puedes atrapar varios tipos de errores con varios catch.

try {
    int[] numeros = {1, 2, 3};
    System.out.println(numeros[5]); // Índice fuera de rango
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("❌ Error: índice inválido");
} catch (Exception e) {
    System.out.println("❌ Error general: " + e.getMessage());
}

---

✅ 5. Uso de finally
El bloque finally siempre se ejecuta, haya error o no.
finally block always executes, whether an error occurs or not.

try {
    System.out.println("Abriendo archivo...");
    // código que podría fallar
} catch (Exception e) {
    System.out.println("Ocurrió un error");
} finally {
    System.out.println("Cerrando archivo...");
}

---

✅ 6. Lanzar excepciones manualmente
Podemos lanzar un error intencionalmente con throw.

public static void verificarEdad(int edad) {
    if (edad < 18) {
        throw new IllegalArgumentException("Edad mínima requerida es 18");
    }
    System.out.println("Edad válida");
}

✅ Resumen rápido
✔ try → código que podría fallar
✔ catch → qué hacer si falla
✔ finally → siempre se ejecuta
✔ throw → lanzar una excepción manualmente

✅ Manejar errores evita que el programa se detenga inesperadamente.
✅ Handling errors prevents the program from stopping unexpectedly.

