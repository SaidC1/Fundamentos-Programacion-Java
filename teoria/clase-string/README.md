# 🔤 Clase String en Java / String Class in Java

Una cadena (`String`) es una secuencia de caracteres. En Java, los `String` son objetos que representan texto.  
A `String` is a sequence of characters. In Java, a `String` is an object that represents text.

---

## 🧰 Métodos comunes con ejemplo práctico  
## 🧰 Common Methods with Practical Example

```java
public class EjemploString {
    public static void main(String[] args) {
        String nombre = "Irvin";
        String frase = "Hola mundo";

        System.out.println("📏 Longitud / Length: " + nombre.length());               // 5
        System.out.println("🔠 Mayúsculas / Uppercase: " + nombre.toUpperCase());     // IRVIN
        System.out.println("🔡 Minúsculas / Lowercase: " + nombre.toLowerCase());     // irvin
        System.out.println("🔍 Primera letra / First letter: " + nombre.charAt(0));   // I
        System.out.println("🔎 Contiene 'vin'?: " + nombre.contains("vin"));          // true
        System.out.println("🧩 Subcadena / Substring(0,3): " + nombre.substring(0, 3)); // Irv
        System.out.println("🔄 Reemplazo / Replace: " + frase.replace("mundo", "Irvin")); // Hola Irvin
        System.out.println("🧭 indexOf('a'): " + frase.indexOf("a"));                 // 1
        System.out.println("⚖️ Igual a 'IRVIN'?: " + nombre.equals("IRVIN"));         // false
        System.out.println("🆚 Igual ignorando mayúsculas?: " + nombre.equalsIgnoreCase("IRVIN")); // true
        System.out.println("❔ ¿Está vacía? / isEmpty(): " + nombre.isEmpty());       // false
    }
}

---

📌 Notas importantes / Important Notes
Los String son inmutables: cada vez que los modificas, se crea uno nuevo.
String objects are immutable: each time you modify them, a new one is created.

Para comparar cadenas, usa .equals() o .equalsIgnoreCase(), no ==.
To compare strings, use .equals() or .equalsIgnoreCase(), not ==.

---

✅ La clase String es esencial para manipular texto en casi cualquier programa en Java.
✅ The String class is essential for handling text in almost any Java program.


