# 🔁 Ciclo do-while  
# 🔁 do-while Loop

---

## 🧠 ¿Qué es un ciclo do-while?  
## 🧠 What is a do-while loop?

El ciclo `do-while` es una estructura de control que repite un bloque de código **al menos una vez**, y luego continúa repitiéndose **mientras se cumpla la condición**.

The `do-while` loop is a control structure that repeats a block of code **at least once**, and then continues repeating **while the condition is true**.

---

## 🧪 Sintaxis  
## 🧪 Syntax

```java
do {
    // Instrucciones
} while (condición);

---

🧍 Ejemplo en Java
🧍 Example in Java

import java.util.Scanner;

public class EjemploDoWhile {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingresa número (negativo para salir): ");
            numero = sc.nextInt();
            System.out.print("Ingresaste: " + numero);
        } while (numero >= 0);

        System.out.println("Has salido del ciclo.").
    }
}

---

✅ ¿Cuándo usar do-while?
✅ When to use do-while?
Cuando el bloque debe ejecutarse al menos una vez.
When the block must execute at least once.
Útil para menús, validaciones o lectura de datos.
Useful for menus, validations, or data input.

---

🧠 Diferencias clave con while
🧠 Key differences with while

| Característica / Feature    | while                            | do-while                      |
| --------------------------- | -------------------------------- | ----------------------------- |
| Evalúa la condición primero | ✅ Sí / Yes                       | ❌ No                          |
| Garantiza una ejecución     | ❌ No necesariamente / Not always | ✅ Sí / Yes                    |
| Uso común                   | Ciclos con condición inicial     | Ciclos con acción garantizada |
