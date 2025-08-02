# 🧠 Estructuras Anidadas en Java  
# 🧠 Nested Structures in Java

Las **estructuras anidadas** en Java ocurren cuando una estructura de control está **dentro de otra**.  
**Nested structures** happen when one control structure is **inside another**.

Se pueden anidar condicionales (`if`, `switch`) o ciclos (`for`, `while`).  
You can nest conditionals (`if`, `switch`) or loops (`for`, `while`).

---

## 🔹 if dentro de if / if inside if

```java
int edad = 20;
boolean estudiante = true;

if (edad >= 18) {
    if (estudiante) {
        System.out.println("Eres mayor de edad y estudiante");
    } else {
        System.out.println("Eres mayor de edad, pero no eres estudiante");
    }
}

---

🔹 Ciclos dentro de ciclos / Loops inside loops

for (int i = 1; i <= 3; i++) {
    for(int j = 1; j <= j++) {
        System.out.print("i: " + i + ", j: " + j);
    }
}

Salida / Output:

i: 1, j: 1  
i: 1, j: 2  
i: 2, j: 1  
i: 2, j: 2  
i: 3, j: 1  
i: 3, j: 2  

---

🔹 switch dentro de if / switch inside if

int edad = 16;
String nivel = "B";

if (edad >= 15) {
    switch (nivel) {
        case "A":
            System.out.println("Nivel A");
            break;
        case "B":
            System.out.println("Nivel B");
            break;
        default:
            System.out.println("Nivel desconocido");
    }
}

---

⚠️ Buenas prácticas / Best Practices
✅ Mantén el código indentado y legible
✅ Usa llaves {} aunque no sean obligatorias
✅ No anides demasiados niveles (difícil de leer)
✅ Puedes extraer código a métodos si se complica

---

📌 ¿Para qué sirven? / Why use them?
Para aplicar condiciones múltiples

Para controlar flujos más complejos

Para validar múltiples datos relacionados.

Para trabajar con estructuras bidimensionales.

---

🧠 Resumen / Summary

| Concepto / Concept | Descripción / Description                 |
| ------------------ | ----------------------------------------- |
| Estructura anidada | Estructura dentro de otra                 |
| Común en           | if, switch, for, while                    |
| Riesgo             | Código confuso si no se indentan bien     |
| Solución           | Indentación, nombres claros, usar métodos |

