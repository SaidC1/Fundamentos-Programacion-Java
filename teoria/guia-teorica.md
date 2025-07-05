# 📘 Guía Teórica – Fundamentos de Programación  
# 📘 Theoretical Guide – Programming Fundamentals

---

## 🧠 ¿Qué es la programación?  
## 🧠 What is Programming?

Programar es escribir instrucciones que una computadora puede entender y ejecutar para resolver un problema.  
Programming means writing instructions a computer can understand and execute to solve a problem.

- **Algoritmo / Algorithm**: Pasos ordenados para resolver un problema. / Ordered steps to solve a problem.  
- **Lenguaje de programación / Programming language**: Medio para escribir algoritmos. / Tool to write algorithms.  
- **Compilador / Compiler**: Traduce el código a lenguaje máquina. / Translates code into machine language.  
- **Pseudocódigo / Pseudocode**: Representación informal de un algoritmo. / Informal algorithm representation.  
- **Diagrama de flujo / Flowchart**: Representación gráfica del algoritmo. / Graphical representation of an algorithm.

---

## 🔄 Etapas del desarrollo de un programa  
## 🔄 Stages of Program Development

1. Análisis del problema / Problem analysis  
2. Diseño de solución / Solution design  
3. Codificación / Coding  
4. Pruebas y depuración / Testing and debugging  
5. Documentación / Documentation  
6. Mantenimiento / Maintenance

---

## 🔢 Tipos de datos  
## 🔢 Data Types

| Tipo / Type   | Ejemplo / Example |
|---------------|--------------------|
| `int`         | 5, -3              |
| `double`      | 3.14, -1.5         |
| `char`        | 'A', 'z'           |
| `String`      | "Hola", "Java"     |
| `boolean`     | true, false        |

---

## 🧮 Variables y constantes  
## 🧮 Variables and Constants

```java

int edad = 20;              // variable
final double PI = 3.1416;   // constante / constant

🔁Entrada -> Proceso -> Salida

🔁Input -> Process -> Output

---

Scanner sc = new Scanner(System.in) // Entrada / Input
int a = sc.nextInt();
int resultado = a * 2;              // Proceso / Process
System.out.println(resultado);      // Salida / Output

---

🔀Condicionales

🔀Conditionals

java 

if (edad >= 18) {
    System.out.println("Mayor de edad");
}else {
    System.out.println("Menor de edad");
}

---

🔂Ciclos

🔂Loops

java

for(int i = 0; i < 5; i++) {
    System.out.println(i);
}

java

int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

---

📦Metodo

📦Methods

java 

public static int sumar(int a, int b) {
    return a + b;
}

---

📚Arreglos

📚Arrays 

java

int[] numeros = {1, 2, 3, 4};
System.out.println(numeros[0]); // Impirme 1 / Prints 1

---

⚠️Tipos de errores

⚠️Type of Errors 

- Sintácticos/ Syntax: Errores en la estructura del código (faltan ; o llaves).
- Lógocos / Logic: El código corre pero da resultados incorrectos.
- Ejecución / Runtime: Fallos al correr, como división por cero o índice inválido.

---

✅Buenas Practicas

✅Best Practices

- Usar nombres claros / Use clear variable names.
- Comentar el código / Comment your code.
- Identación adecuada / Proper indentation.
- Usar funciones / Use methods to organize code.

---

✅Ejemplo completo

✅Complete Example

java

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + "!");
    }
}