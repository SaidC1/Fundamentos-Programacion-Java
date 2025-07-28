# 📦 Arrays vs ArrayList en Java / Arrays vs ArrayList in Java

En Java, tanto los **Arrays** como los **ArrayList** sirven para almacenar múltiples valores, pero tienen diferencias importantes.
In Java, both **Arrays** and **ArrayList** store multiple values, but hava key dufferences.

---

##  ✅ 1. Arrays.

Un **Array** es una **estructura fija** que guarda elementos del mismo tipo.
An **Array** is a **fixed structure** that holds elements of the same type.

```java
int[] numeros = {10, 20, 30, 40};

System.out.println(numeros[0]); // 10
numeros[2] = 50;                // Cambia el valor en la posición 2

📌Características:

-Tamaño fijo (no se puede agrandar)
-Todos los elementos son del mismo tipo
-Acceso rápido por índice array[i]

---

## ✅ ArrayList

Un ArrayList es una lista dinámica, su tamaño puede crecer o reducirse.
An ArrayList is a dynamic list, it can grow or shrink.

```java

import java.util.ArrayList;

ArrayList<String> nombres = new ArrayList<>();

nombres.add("Juan");
nombres.add("Ana");
nombres.add("Pedro");

System.out.println(nombres.get(0)); // Juan
nombres.remove(1);                  // Elimina "Ana"
System.out.println(nombres.size())  // 2 elementos

📌Características:

-Tamaño dinámico (crece o reduce según agregues/elimines)
-Métodos útiles: .add(), .remove(), .get(), size()
-Puede guardar objetos, no tipos primitivos directamente.

✅ Comparación rápida

| Característica    | Array      | ArrayList                  |
| ----------------- | ---------- | -------------------------- |
| **Tamaño**        | Fijo       | Dinámico (crece/encoge)    |
| **Tipo de datos** | Solo uno   | Objetos (usa wrappers)     |
| **Métodos extra** | No         | Sí (`add`, `remove`, etc.) |
| **Velocidad**     | Más rápido | Un poco más lento          |
| **Acceso**        | `array[i]` | `lista.get(i)`             |

---

✅ Ejemplo práctico comparando ambos

```java

import java.util.ArrayList;

public class ComparacionArrayList {
    public static void main(String[] args) {
        
        // Array fijo
        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        // numeros[3] = 4; ❌ Error: fuera de rango

        // Array dinámico
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4); // ✅ se puede agregar más

        System.out.println("Array longuitud: " + numeros.length);
        System.out.println("ArrayList tamañp " lista.size());
    }
}

Salida / Output:

Array longitud: 3
ArrayList tamaño: 4

---

✅ ¿Cuándo usar cada uno?

-✅ Usar Array cuando:
    - Sabes el tamaño desde el inicio.
    - Necesitas máxima eficiencia.

-✅ Usa ArrayList cuando:
    - No conoces el tamaño.
    - Necesitas agregar o eliminar elementos dinámicamente.

---

✅ Array = más simple y rápido pero fijo.
✅ ArrayList = más flexible y dinámico, pero con más sobrecarga.
