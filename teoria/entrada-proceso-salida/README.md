# 🔄 Entrada - Proceso - Salida en Java / Input - Process - Output in Java

Todo programa sigue el **modelo básico** de **entrada → Proceso → Salida**.
Every program follows the **basic model** of **Input → Process → Output**.

---

## ✅ Entrada / Input

Es **cómo obtenemos datos** para que el programa trabaje con ellos.
It´s **how we get data** for the program to work with.

Ejemplo:
````java
Scanner sc = new Scanner(System.in);
System.out.print("Ingresa un número: ");
int numero = sc.nextInt();

---

✅ 2. Proceso / Process

Es la lógica o cálculo que aplica el programa con los datos.
It´s the logic or calculation the program applies to the data.

Ejemplo:
```java

int resultado = numero * 2; // Duplicar el número

---

✅ 3. Salida / Output

Es mostrar el resultado al usuario.
It´s showing the result to the user.

Ejemplo:
```java

System.out.println("El doble es: " + resultado);

---

🧪 Ejemplo completo

```java

import java.util.Scanner;

public class EntradaProcesoSalida {
    public static void main(String[] args) {

        // Entrada 
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        // Proceso
        int edadEnDias = edad * 365;

        // Salida 
        System.out.println("Has vivido aproximadamente " + edadEnDias + " días.");
    }
}