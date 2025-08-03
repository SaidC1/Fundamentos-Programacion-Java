# ❓ Operador Condicional Ternario en Java  
# ❓ Ternary Conditional Operator in Java

El operador ternario es una forma **abreviada** de escribir una estructura `if-else`.  
The ternary operator is a **short version** of writing an `if-else` statement.

---

## ✅ Sintaxis / Syntax.

```java
condición ? valor_si_verdadero : valor_si_falso;

condition ? true_value : false_value;

---

🔹 Ejemplo básico / Basic Example.

int edad = 18;
String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
System.out.println(resultado);

Salida / Output:

Mayor de edad

---

🔹 Comparado con if-else / Compared to if-else.

// Versión larga
if (edad >= 18) {
    resultado = "Mayor de edad";
} else {
    resultado = "Menor de edad";
}

// Versión con operador ternario
resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

---

🔄 Ejemplo con números / Numeric Example.

int a = 10, b = 20;
int mayor = (a > b) ? a : b;
System.out.println("El mayor es: " + mayor);

Output:

El mayor es: 20

---

⚠️ Cuándo usarlo / When to use.
✅ Útil para expresiones simples.
✅ Ideal para asignaciones directas.
⚠️ Evita usarlo con lógica compleja, puede volverse ilegible.

---

✅ Resumen / Summary.

| Concepto / Concept | Explicación / Explanation                     |
| ------------------ | --------------------------------------------- |
| Operador ternario  | Alternativa corta a if-else                   |
| Símbolos usados    | `?` y `:`                                     |
| Usos típicos       | Asignar un valor dependiendo de una condición |
| Precaución         | No abusar si la lógica es complicada          |

El operador ternario te permite escribir código más limpio y compacto, si lo usas con responsabilidad.
The ternary operator helps you write cleaner and shorter code, if used wisely.

