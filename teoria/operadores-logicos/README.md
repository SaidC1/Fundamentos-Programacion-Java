
---

### 📄 `guia-teorica/operadores-logicos/README.md`

```markdown
# 🔁 Operadores Lógicos / Logical Operators

Los operadores lógicos se usan para combinar condiciones booleanas.  
Logical operators are used to combine boolean conditions.

---

| Operador / Operator | Español / Spanish | Inglés / English              | Ejemplo / Example     |
|---------------------|-------------------|-------------------------------|------------------------|
| `&&`                | Y (AND)           | True si ambas son verdaderas | `x > 0 && x < 10`      |
| `||`                | O (OR)            | True si una es verdadera     | `x < 0 || x > 10`      |
| `!`                 | NO (NOT)          | Niega la condición            | `!(x > 5)`             |

---

### 🧪 Ejemplo / Example

```java
int edad = 25;
boolean tieneID = true;

if (edad >= 18 && tieneID) {
    System.out.println("Puede entrar / Can enter");
}
