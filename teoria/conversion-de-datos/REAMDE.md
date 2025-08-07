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
