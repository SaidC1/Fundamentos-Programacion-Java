# 📦 Paquetes e Imports en Java / Packages and Imports in Java

En Java, los **paquetes** sirven para **organizar clases** y evitar conflictos de nombres.
In Java, **packages** are used to **organize classes** and avoid name conflicts.

El **import** permite usar clases de otros paquetes.
The **import** keyword lets you use classes from other packages.

---

## ✅ 1.¿Qué es un paquete? / what is a packages?

Un **paquete (package)** es como una carpeta donde agrupas clases relacionadas.
A **package** is like a folder that groups related classes.

Ejemplo

miapp/
└── modelos/
Usuario.java
└── utils/
Helper.java


En Java:
```java
package modelos;

public class Usuario {
    String nombre;
}

---

## ✅ 2. Tipos de paquetes / Types of packages

1. Paquetes predeterminados (default)
    Clases sin un paquete explícito.
2. Paquetes definidos por el usuario (user-defined)
    Los que tú creas para organizar tu código.
3. Paquetes incorporados (built-in)
    Los que vienen en Java (ejemplo: java.util, java.io).

---

## ✅ 3. ¿Qué es un import? / What is an import?

El import sirve para traer clases de otros paquetes.
import is used to bring classes from other packages.

Ejemplo:

```java

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola!");
    }
}

---

## ✅ 4. Formas de importar / Ways to import

✔ Importar clase específica

import java.util.ArrayList;

✔ Importar todas las clases del paquete

import java.util.*;

✔ Sin importar

Si está es el mismo paquete, no necesitar import.

---

## ✅ 5. Paquete java.util más usado

Algunas clases comunes:
    - Scanner → leer datos
    - ArrayList → listas dinámicas
    - Date → fechas
    - Random → números aleatorios

ejemplo:

```java

import java.util.Random;

Random r = new Random();
int num = r.nextInt(10); // número aleatorio entre 0 y 9 

---

✅ Ejemplo práctico con paquete propio

1️⃣ Crea archivo en carpeta modelos

```java

packag modelos;

public class Usuario {
    public String nombre;
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
}

2️⃣ Usa en otro archivo

```java

impor modelos.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Irvin");
        System.out.println("Usuario: " + u.nombre);
    }
}

---

✅ Resumen rápido

package = organiza tus clases (como carpetas)

import = permite usar clases de otro paquete

Java ya trae paquetes como java.util, java.io, etc.

Puedes crear tus propios paquetes para proyectos grandes.
