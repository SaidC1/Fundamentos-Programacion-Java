# 🔄 Ciclos for y while / Loops for and while en java

Los **ciclos** permiten repetir un bloque de código varias veces.
**Loops** allow repeating a block of code multiple times.

En Java los más usados son:

✅ `for` → cuando sabemos cuántas veces repetiremos.
✅ `while` → cuando no sabemos cuántas veces, depende de una condición.
✅ `do-while` → cuando queremos ejecutar al menos una vez.

---

## ✅ Ciclo `for`

Se usa cuando **conocemos el número de repeticiones**.
Used when we **know the number of repetitions**.

```java

for(int i = 0; i < 5; i++) {
    System.out.println("Interación: " + i);
}

Salida / Output

Iteración: 0
Iteración: 1
Iteración: 2
Iteración: 3
Iteración: 4

📌 Estructura:

```java

for (inicialización; condición; incremento) {
    // código a repetir 
}

---

✅ Ciclo while

Se usa cuando No sabemos cuántas veces repetiremos, pero depende de una condición.
Used when we don’t know how many times it repeats, but it depends on a condition.

```java

int i = 0;
while(i < 5){
    System.out.println("Contador: " + i)
    i++;
}

Salida / Output:

Contador: 0
Contador: 1
Contador: 2
Contador: 3
Contador: 4

📌 El ciclo se repite mientras la condición sea verdadera.

---

✅ Ciclo do-while

Se ejecuta al menos una vez, luego evalúa la condición.
Executes at least once, then checks the condition.

``` java

int x = 0;
do{
    System.out.println("Valor: " + x);
    x++;
} while (x < 3);

Salida / Output

Valor: 0
Valor: 1
Valor: 2

---

✅ Uso de break y continue

    break → sale del ciclo
    continue → salta a la siguiente iteración

```java

for (int i = 1; i <= 5; i++) {
    if (i == 3) continue; // salta el 3 
    if (i == 5) break;    // se detiene en 5
    System.out.println(i);
}

Salida / Output

1
2
4

---

✅ Resumen rápido

| Ciclo      | Cuándo usarlo / When to use                                                      |
| ---------- | -------------------------------------------------------------------------------- |
| `for`      | Cuando conoces el número de iteraciones / When you know the number of iterations |
| `while`    | Cuando depende de una condición / When it depends on a condition                 |
| `do-while` | Cuando debe ejecutarse al menos una vez / When it must execute at least once     |

✅Los ciclos evitan repetir código innecesariamente y permiten automatizar tareas.
✅Loops prevent unnecesasary repetition and allow aotomating tasks.
