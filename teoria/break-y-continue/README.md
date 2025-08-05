# 🔂 Uso de break y continue en Java  
# 🔂 Using break and continue in Java

Las palabras clave `break` y `continue` se usan para **controlar el flujo de los ciclos** (`for`, `while`, `do-while`).  
The keywords `break` and `continue` are used to **control the flow of loops** (`for`, `while`, `do-while`).

---

## 🛑 `break`: salir del ciclo  
## 🛑 `break`: exit the loop

El `break` detiene el ciclo completamente.  
`break` stops the loop entirely.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) break;
    System.out.println(i);
}

---

Salida / Output:

0  
1  
2  
3  
4

---

🔁 continue: saltar a la siguiente iteración
🔁 continue: skip to next iteration
El continue salta al siguiente ciclo sin ejecutar el resto del código dentro del ciclo.
continue skips the current iteration and jumps to the next loop cycle.

for (int i = 0; i < 5; i++) {
    if (i == 2) continue;
    System.out.println(i);
}

Salida / Output:

0  
1  
3  
4

---

🧠 Ejemplo combinado

for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) continue; // Saltar pares
    if (i == 7) break;        // Detener en 7
    System.out.println(i);
}

Salida / Output:

1  
3  
5

---

✅ ¿Cuándo usarlos?

| Palabra clave / Keyword | Uso / Use                                     |
| ----------------------- | --------------------------------------------- |
| `break`                 | Salir del ciclo completamente / Exit the loop |
| `continue`              | Saltar una iteración / Skip current iteration |
