# 🧮 Operadores Aritméticos en Java / Arithmetic Operators in Java

Los operadores aritméticos permiten realizar operaciones matemáticas básicas.

| Operador | Español             | Inglés               | Ejemplo     | Resultado |
|----------|---------------------|-----------------------|-------------|-----------|
| `+`      | Suma                | Addition              | `5 + 3`     | `8`       |
| `-`      | Resta               | Subtraction           | `10 - 2`    | `8`       |
| `*`      | Multiplicación      | Multiplication        | `4 * 2`     | `8`       |
| `/`      | División            | Division              | `16 / 2`    | `8`       |
| `%`      | Módulo (residuo)    | Modulus (remainder)   | `10 % 3`    | `1`       |

```java
int a = 10;
int b = 3;

System.out.println(a % b); // Imprime 1 (resto de 10 ÷ 3)


---

### 📄 `guia-teorica/operadores-relacionales/README.md`

```markdown
# ⚖️ Operadores Relacionales en Java / Relational Operators in Java

Los operadores relacionales permiten comparar valores y devuelven un resultado booleano (`true` o `false`).

| Operador | Español             | Inglés               | Ejemplo (`x = 5, y = 8`) | Resultado |
|----------|---------------------|-----------------------|--------------------------|-----------|
| `==`     | Igual a             | Equal to              | `x == y`                 | false     |
| `!=`     | Distinto de         | Not equal             | `x != y`                 | true      |
| `>`      | Mayor que           | Greater than          | `x > y`                  | false     |
| `<`      | Menor que           | Less than             | `x < y`                  | true      |
| `>=`     | Mayor o igual       | Greater or equal      | `x >= y`                 | false     |
| `<=`     | Menor o igual       | Less or equal         | `x <= y`                 | true      |

```java
int edad = 20;
if (edad >= 18) {
    System.out.println("Mayor de edad");
}


---

### 📄 `guia-teorica/operadores-logicos/README.md`

```markdown
# 🔁 Operadores Lógicos en Java / Logical Operators in Java

Los operadores lógicos se utilizan para combinar condiciones en estructuras como `if`, `while`, etc.

| Operador | Nombre        | Significado                            | Ejemplo             |
|----------|---------------|-----------------------------------------|---------------------|
| `&&`     | AND (y)       | Verdadero si ambas condiciones son verdaderas | `x > 0 && x < 10` |
| `||`     | OR (o)        | Verdadero si al menos una es verdadera | `x < 0 || x > 10`   |
| `!`      | NOT (no)      | Niega una condición                     | `!(x > 5)`          |

```java
int edad = 25;
boolean tieneID = true;

if (edad >= 18 && tieneID) {
    System.out.println("Puede entrar");
}

