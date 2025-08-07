# 🔄 Conversión de Datos en Java  
# 🔄 Data Conversion in Java

La conversión de datos permite transformar un valor de un tipo a otro.  
Data conversion allows you to transform a value from one type to another.

Hay dos tipos principales de conversión:  
There are two main types of conversion:

1. 🔹 Conversión implícita (automática) / Implicit (automatic) conversion  
2. 🔸 Conversión explícita (casting) / Explicit (manual) conversion

---

## 🔹 Conversión implícita / Implicit Conversion

Java convierte automáticamente tipos **más pequeños a más grandes** (ej. int → double).

```java
int numero = 10;
double resultado = numero;  // Conversión implícita
System.out.println(resultado); // 10.0

✅ No hay pérdida de datos.
✅ No se necesita conversión manual.

---

🔸 Conversión explícita / Explicit Conversion (Casting)
Cuando pasas de un tipo más grande a uno más pequeño, Java requiere casting manual.

double pi = 3.1416;
int entero = (int) pi; // Casting
System.out.println(entero); // 3

⚠️ Puede haber pérdida de información.  

📦 Conversión entre tipos primitivos / Conversion between primitive types

| De / From | A / To | Requiere casting |
| --------- | ------ | ---------------- |
| int       | double | ❌ No             |
| double    | int    | ✅ Sí             |
| char      | int    | ❌ No             |
| int       | char   | ✅ Sí             |

---

📚 Conversión de String a número / Converting String to number

String texto = "123";
int numero = Integer.parseInt(texto); // String a int

double decimales = Double.parseDouble("3.14"); // String a double

---

🧠 Conversión de número a String / Number to String

int numero = 50;
String texto = String.valueOf(numero);

double precio = 9.99;
String resultado = Double.toString(precio);

---

✅ Buenas prácticas / Best Practices
Verifica que el valor se pueda convertir antes de hacerlo.
Usa excepciones para manejar errores de conversión (try-catch).
Usa Integer.parseInt() y similares con cuidado si el String puede tener letras.

---

🔍 Ejemplo completo

import java.util.Scanner;

public class ConversionEjemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número decimal: ");
        double decimal = sc.nextDouble();

        int entero = (int) decimal;
        System.out.println("Decimal: " + decimal);
        System.out.println("Convertido a entero: " + entero);
    }
}

🧠 Resumen / Summary

| Tipo / Type     | Descripción / Description                    |
| --------------- | -------------------------------------------- |
| Implícita       | Java convierte automáticamente               |
| Explícita       | Tú haces el casting manualmente              |
| String → número | Usa `Integer.parseInt`, `Double.parseDouble` |
| Número → String | Usa `String.valueOf`, `.toString()`          |
