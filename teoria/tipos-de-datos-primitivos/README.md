# 🔢 Tipos de Datos Primitivos en Java / Primitive Data Types in Java

Java tiene 8 tipos de datos primitivos que se usan para representar valores simples.  
Java has 8 primitive data types used to represent simple values.

---

## 🧠 ¿Qué es un tipo de dato primitivo?  
## 🧠 What is a primitive data type?

Es un tipo de dato básico, **no es un objeto**, y se utiliza para almacenar valores como números, caracteres o booleanos.  
It's a basic data type, **not an object**, and is used to store values such as numbers, characters, or booleans.

---

## 📊 Tabla de tipos primitivos / Primitive types table

| Tipo / Type | Tamaño / Size | Valor Ejemplo / Example Value | Descripción / Description                     |
|-------------|----------------|-------------------------------|-----------------------------------------------|
| `byte`      | 8 bits         | `100`                         | Entero pequeño / Small integer                |
| `short`     | 16 bits        | `1000`                        | Entero corto / Short integer                  |
| `int`       | 32 bits        | `100000`                      | Entero estándar / Standard integer            |
| `long`      | 64 bits        | `10000000000L`                | Entero largo / Long integer (termina en `L`) |
| `float`     | 32 bits        | `3.14f`                       | Decimal pequeño / Small decimal (termina en `f`) |
| `double`    | 64 bits        | `3.1416`                      | Decimal grande / Larger decimal               |
| `char`      | 16 bits        | `'A'`                         | Carácter unicode / Unicode character          |
| `boolean`   | 1 bit (lógico) | `true` o `false`              | Verdadero o falso / True or false             |

---

## 🧪 Ejemplo de uso / Example of usage

```java
public class TiposPrimitivos {
    public static void main(String[] args) {
        byte edad = 25;
        int numero = 1000;
        long grande = 123456789L;
        float pi = 3.14f;
        double raiz = 1.732;
        char letra = 'J';
        boolean activo = true;

        System.out.println("Edad: " + edad);
        System.out.println("Número: " + numero);
        System.out.println("Long: " + grande);
        System.out.println("Float: " + pi);
        System.out.println("Double: " + raiz);
        System.out.println("Letra: " + letra);
        System.out.println("Activo: " + activo);
    }
}

---

📌 Notas importantes / Important notes

Siempre declara variables con el tipo adecuado al valor que vas a manejar.
Always declare variables with the correct type for the value you need.
Para valores decimales, usa float o double. Recuerda usar f o L cuando sea necesario.
For decimal numbers, use float or double. Don’t forget the f or L suffix when required.
char solo puede almacenar un carácter entre comillas simples 'A'.
char can only store one character using single quotes 'A'.
boolean solo acepta true o false.
boolean only accepts true or false.

---

✅ Los tipos primitivos son esenciales para representar información básica en cualquier programa Java.
✅ Primitive types are essential to represent basic information in any Java program.
