# 🧵 StringBuilder y StringBuffer en Java  
# 🧵 StringBuilder and StringBuffer in Java

En Java, las clases `StringBuilder` y `StringBuffer` se usan para **modificar cadenas de texto dinámicamente**, sin crear nuevos objetos cada vez.  
In Java, `StringBuilder` and `StringBuffer` are used to **modify strings dynamically**, without creating new objects each time.

---

## ✅ ¿Por qué no usar solo `String`?  
## ✅ Why not only use `String`?

En Java, los objetos `String` son **inmutables** (no se pueden cambiar).  
Cada vez que modificas un `String`, en realidad se crea uno nuevo.

In Java, `String` objects are **immutable**.  
Each time you change a `String`, it creates a new object.

```java
String s = "Hola";
s += " Mundo"; // Se crea un nuevo objeto

Para evitar esto y hacer el proceso más eficiente, usamos StringBuilder o StringBuffer.

---

🔄 StringBuilder
Más rápido

No es seguro para hilos (no thread-safe)

Ideal para aplicaciones de un solo hilo


```java 

StringBuilder sb = new StringBuilder("Hola");
sb.append(" Mundo");
System.out.println(sb); // Hola Mundo

---

🔒 StringBuffer
Más lento que StringBuilder

Sí es seguro para hilos (thread-safe)

Se usa cuando varios hilos acceden al mismo objeto

```java

StringBuffer sbf = new StringBuffer("Hola");
sbf.append(" Mundo");
System.out.println(sbf); // Hola Mundo

---

🔧 Métodos comunes (ambos)

| Método            | Descripción / Description                |
| ----------------- | ---------------------------------------- |
| `.append(x)`      | Agrega texto al final / Adds text at end |
| `.insert(i, x)`   | Inserta texto en posición i              |
| `.delete(a, b)`   | Elimina caracteres de a a b              |
| `.replace(a,b,x)` | Reemplaza parte del texto                |
| `.reverse()`      | Invierte la cadena / Reverses the text   |
| `.length()`       | Devuelve la longitud / Returns length    |

---

🔍 Ejemplo práctico

public class EjemploStringBuilder {
    public static void main(String[]args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" es genial");
        sb.insert(5, "📌");
        sb.replace(0, 4, "Python");
        sb.reverse();

        System.out.println(sb); // Se imprime invertido
    }
}

---

✅ ¿Cuál usar?

| Caso de uso / Use case           | Usa / Use       |
| -------------------------------- | --------------- |
| Aplicaciones normales            | `StringBuilder` |
| Aplicaciones con múltiples hilos | `StringBuffer`  |
| Texto estático, sin modificar    | `String`        |

---

📌 Resumen
StringBuilder y StringBuffer permiten modificar texto sin crear nuevos objetos

Son más eficientes que concatenar con +

Usa StringBuilder si no trabajas con múltiples hilos

Usa StringBuffer si necesitas sincronización en entornos multihilo