# 📥 Lectura de Datos con Scanner en Java / Reading Input with Scanner in Java.

Para leer datos del usuario en Java se utiliza la clase **`Scanner`** del paquete `java.util`.  
To read user input in Java, we use the **`Scanner`** class from the `java.util` package.

---

## ✅ Crear un objeto Scanner / Create a Scanner object.

```java
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear Scanner
    }
}

📌 System.in → indica que leeremos desde la entrada estándar (teclado).

---

🧪 Leer diferentes tipos de datos / Read different data types

import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer un texto / Read a String
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        // Leer un entero / Read an int
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        // Leer un número decimal / Read a double
        System.out.print("Ingresa tu altura: ");
        double altura = sc.nextDouble();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años y mides " + altura + "m.");
    }
}

Salida ejemplo / Example output:

Ingresa tu nombre: Irvin
Ingresa tu edad: 20
Ingresa tu altura: 1.75
Hola Irvin, tienes 20 años y mides 1.75m.

---

📌 Métodos comunes de Scanner / Common Scanner methods
Método / Method	Qué lee / What it reads
nextLine()	Una línea de texto / A full line
next()	Una sola palabra / One word
nextInt()	Número entero / Integer
nextDouble()	Número decimal / Decimal
nextBoolean()	true o false

---

⚠️ Problema común: salto de línea
Cuando mezclas nextInt() y nextLine(), a veces queda un salto de línea pendiente.
When mixing nextInt() and nextLine(), sometimes a leftover newline causes issues.

Solución:

sc.nextLine(); // consumir el salto de línea pendiente

---

✅ Scanner es útil para leer datos interactivos desde consola.
✅ Scanner is useful for reading interactive input from the console.


---

Ahora vamos con el **tema 13: estructura if-else**.  

---

## 📂 `guia-teorica/estructura-if-else/README.md`

```markdown
# 🔀 Condicionales if-else en Java / if-else Conditionals in Java

El `if-else` permite ejecutar diferentes bloques de código según una condición.  
`if-else` allows executing different blocks of code based on a condition.

---

## ✅ Sintaxis básica / Basic syntax

```java
if (condición) {
    // código si la condición es verdadera
} else {
    // código si la condición es falsa
}

📌 condición → expresión booleana (true o false).

---

🧪 Ejemplo simple / Simple example

int edad = 18;

if (edad >= 18) {
    System.out.println("Eres mayor de edad");
} else {
    System.out.println("Eres menor de edad");
}

Salida con edad=18:

Eres mayor de edad

---

🔄 if-else-if (múltiples condiciones)

int nota = 85;

if (nota >= 90) {
    System.out.println("Excelente");
} else if (nota >= 70) {
    System.out.println("Aprobado");
} else {<>
    System.out.println("Reprobado");
}

---

✅ if sin else

boolean llueve = true;

if (llueve) {
    System.out.println("Lleva paraguas");
}

✅ Operador ternario / Ternary operator
Forma corta de if-else para asignar valores.

int edad = 20;
String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
System.out.println(mensaje);

---

📌 Buenas prácticas / Best practices
Usar if-else-if para múltiples condiciones.

Evitar anidar muchos if (mejor usar switch si son muchas opciones).

Mantener las condiciones simples y legibles.

---

✅ if-else es la base para tomar decisiones en un programa.
✅ if-else is the base for decision making in a program.
