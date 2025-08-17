
---

### 📄 `guia-teorica/operadores-relacionales/README.md`

```markdown
# ⚖️ Operadores Relacionales / Relational Operators.

Los operadores relacionales comparan valores y devuelven `true` o `false`.  
Relational operators compare values and return `true` or `false`.

---

| Operador / Operator | Español / Spanish    | Inglés / English     | Ejemplo / Example (`x = 5, y = 8`) | Resultado / Result |
|---------------------|----------------------|----------------------|-----------------------------------|--------------------|
| `==`                | Igual a              | Equal to             | `x == y`                          | `false`            |
| `!=`                | Distinto de          | Not equal            | `x != y`                          | `true`             |
| `>`                 | Mayor que            | Greater than         | `x > y`                           | `false`            |
| `<`                 | Menor que            | Less than            | `x < y`                           | `true`             |
| `>=`                | Mayor o igual que    | Greater or equal     | `x >= y`                          | `false`            |
| `<=`                | Menor o igual que    | Less or equal        | `x <= y`                          | `true`             |

---

### 🧪 Ejemplo / Example

```java
int edad = 20;

if (edad >= 18) {
    System.out.println("Mayor de edad / Legal age");
}

---
