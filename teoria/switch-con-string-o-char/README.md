# 🎮 Switch con String o char / Switch with String or char

El uso de `switch` permite ejecutar diferentes bloques de código según el valor de una variable.  
Using `switch` allows executing different code blocks depending on a variable's value.

Desde Java 7, `switch` también admite `String`, además de `char` y `int`.  
Since Java 7, `switch` also supports `String`, in addition to `char` and `int`.

---

## 🧠 Sintaxis básica / Basic Syntax

```java
switch (variable) {
    case valor1:
        // código
        break;
    case valor2:
        // código
        break;
    default:
        // si no coincide nada
}

---

🧪 Ejemplo con char / Example with char

char letra = 'a';

switch (letra) {
    case 'a':
        System.out.println("Vocal A");
        break;
    case 'e':
        System.out.println("Vocal E");
        break;
    default:
        System.out.println("Otra letra");
}

🖨️ Salida / Output: Vocal A

---

🧪 Ejemplo con String / Example with String

String opcion = "jugar";

switch (opcion) {
    case "jugar":
        System.out.println("Has elegido jugar / You chose to play");
        break;
    case "salir":
        System.out.println("Has elegido salir / You chose to exit");
        break;
    default:
        System.out.println("Opción inválida / Invalid option");
}

🖨️ Salida / Output:Has elegido jugar / You chose to play

---

❗ Notas importantes / Important Notes
El uso de break es esencial para evitar que los casos se ejecuten en cadena.
Using break is essential to prevent fall-through.

Las comparaciones con String son sensibles a mayúsculas/minúsculas.
Comparisons with String are case-sensitive.

String dia = "Lunes";

switch (dia.toLowerCase()) {
    case "lunes":
        System.out.println("Inicio de semana / Start of the week");
        break;
}

Puedes usar toLowerCase() o toUpperCase() para estandarizar.
You can use toLowerCase() or toUpperCase() to normalize values.

---

✅ El uso de switch mejora la legibilidad y organización del código en decisiones múltiples.
✅ Using switch improves readability and organization in multiple-choice logic.

