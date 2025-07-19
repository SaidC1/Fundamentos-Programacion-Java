#📝 Variables y Constantes en Java / Variables  and Constants in Java

En Java, **las variables** almacenan datos que pueden cambiar durante la ejecucion del programa.
In Java, **variables** store date that can change during program execution.

**Las constantes** son valores que NO pueden cambiar despúes de ser asignados.
**Constants** are values that Cannot change after being assigned.

---

## ✅ Declarar variables / Declare variables 

```java
tipo nombre = valor;

---

# tipo / type -> tipo de dato (int, double, String, etc.)
# nombre / name -> identificador de la variable
# valor / value -> dato incial (opcional)

---

int edad = 20;
double alturo = 1.75
String nombre = "Irvin";
boolean activo = true;

---

✅ Declarar constantes / Declare constants

Para declarar una constante usamos final.

final double PI = 3.1416
final int MAX_USUARIO = 100;

---

Convención:

# Constantes suelen escribirse en MAYÚSCULAS    
# Variables en minúscula / camelCase.

---

✅ Reglas para nombres / Naming rules

✅ Permitido: letras, números, _ y $
✅ Debe empezar con letra, _ o $ (no número)
✅ No puede ser una palabra reservada

ejemplo válidos:

int contador;
double precioProducto;
String nombre_usuario;

ejemplo inválidos;

int 1numero; // No puede iniciar con número
double class; // class es palabra reservada

---

✅ Ambito de las variables / Variable scope

# Locales: declaradas dentro de un método o bloque, solo existen allí.
# Globales (atributos): declaradas en la clase, accesibles en varios métodos.

public class Ejemplo {
    static int global = 100; // variable global 
    
    public static void main(String[] args) {
        int local = 50; // Variable local
        System.out.println (local + global);
    }
}

---

✅ Ejemplo práctico

public class VariablesConstantes {
    public static void main(String[] args) {
        int edad = 25,              // variable
        final double PI = 3.1416;   // constante

        edad = edad + 1; // no se puede cambiar
        // PI = 3.15;    // ❌ ERROR; no se puede modificar una constante

        System.out.println("Edad: " + edad);
        System.out.println("Valor de PI: " + PI);      
    }
}

Salidad / Output:

Edad: 26
Valor de PI: 3.1416

---

📌 Buenas prácticas / Best practices

✅ Usar nombres descriptivos(no x, y, exepto en ejemplos simples).
✅ Escribir las constantes en MAYÚSCULAS.
✅ Inicializar variables al declararlas para evitar valores nulos.

---

✅ Variables --> datos que puede cambiar.
✅ Constantes --> valores fijos que no deben modificarse.
 
