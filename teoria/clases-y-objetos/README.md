# 🏗️ Clases y Objetos en Java  
# 🏗️ Classes and Objects in Java

En Java, **todo se basa en clases y objetos**.  
In Java, **everything is based on classes and objects**.

---

## 📌 ¿Qué es una clase? / What is a class?

Una **clase** es como un plano o plantilla que define las características y comportamientos de algo.  
A **class** is like a blueprint that defines the characteristics and behaviors of something.

- **Atributos / Attributes** → variables dentro de la clase  
- **Métodos / Methods** → funciones que realizan acciones

Ejemplo de clase:

```java
public class Persona {
    // Atributos / Attributes
    String nombre;
    int edad;

    // Método / Method
    void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}

---

📌 ¿Qué es un objeto? / What is an object?
Un objeto es una instancia de una clase, es decir, algo creado a partir de esa plantilla.
An object is an instance of a class, created from the blueprint.

public class Main {
    public static void main(String[] args) {
        // Crear objeto / Create object
        Persona p1 = new Persona();
        
        // Asignar valores / Assign values
        p1.nombre = "Irvin";
        p1.edad = 20;
        
        // Usar método / Use method
        p1.saludar();
    }
}

Salida / Output:

Hola, mi nombre es Irvin

---

🔹 Diferencia entre clase y objeto / Difference between class and object

| Clase / Class | Objeto / Object |
| ------------- | --------------- |
| Plano         | Casa construida |
| Plantilla     | Producto final  |
| Definición    | Instancia       |

---

📌 Constructor en una clase / Constructor in a class
Un constructor es un método especial que se ejecuta automáticamente al crear un objeto.
A constructor is a special method that runs automatically when creating an object.

public class Persona {
    String nombre;
    int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Irvin", 20);
        p1.saludar();
    }
}

---

✅ Buenas prácticas / Best Practices
Usar nombres claros para clases y atributos
La primera letra de la clase siempre en mayúscula
Cada clase debe ir en su propio archivo .java
Usar constructores para inicializar objetos

---

🧠 Resumen / Summary

| Concepto / Concept | Descripción / Description     |
| ------------------ | ----------------------------- |
| Clase / Class      | Plantilla de datos y acciones |
| Objeto / Object    | Instancia de una clase        |
| Atributos          | Datos de un objeto            |
| Métodos            | Acciones de un objeto         |
| Constructor        | Inicializa el objeto          |
