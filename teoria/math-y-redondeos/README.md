# 📐 Clase Math y Redondeos en Java / Math Class and Rounding in Java

La clase `Math` en Java ofrece métodos para realizar cálculos matemáticos comunes como potencias, raíces, redondeos, valores absolutos, etc.  
The `Math` class in Java provides methods for common mathematical calculations such as powers, roots, rounding, absolute values, etc.

---

## 🔢 Métodos comunes de `Math` / Common `Math` Methods

| Método / Method  | Descripción / Description                        | Ejemplo / Example | Resultado / Result |
| ---------------- | ------------------------------------------------ | ----------------- | ------------------ |
| `Math.pow(a, b)` | Potencia / Power                                 | `Math.pow(2, 3)`  | `8.0`              |
| `Math.sqrt(a)`   | Raíz cuadrada / Square root                      | `Math.sqrt(16)`   | `4.0`              |
| `Math.cbrt(a)`   | Raíz cúbica / Cube root                          | `Math.cbrt(27)`   | `3.0`              |
| `Math.abs(a)`    | Valor absoluto / Absolute value                  | `Math.abs(-5)`    | `5`                |
| `Math.max(a, b)` | Máximo / Maximum of two                          | `Math.max(3, 7)`  | `7`                |
| `Math.min(a, b)` | Mínimo / Minimum of two                          | `Math.min(3, 7)`  | `3`                |
| `Math.round(a)`  | Redondeo normal / Normal rounding                | `Math.round(3.6)` | `4`                |
| `Math.floor(a)`  | Redondeo hacia abajo / Round down (floor)        | `Math.floor(3.9)` | `3.0`              |
| `Math.ceil(a)`   | Redondeo hacia arriba / Round up (ceiling)       | `Math.ceil(3.1)`  | `4.0`              |
| `Math.random()`  | Número aleatorio entre 0.0 y 1.0 / Random number | `Math.random()`   | `0.0 – 0.999...`   |

---

## 🧪 Ejemplo práctico / Practical example

```java
public class EjemploMath {
    public static void main(String[] args) {
        double numero = 5.7;

        System.out.println("Redondeo normal / Round: " + Math.round(numero));
        System.out.println("Redondeo abajo / Floor: " + Math.floor(numero));
        System.out.println("Redondeo arriba / Ceil: " + Math.ceil(numero));
        System.out.println("Raíz cuadrada / Sqrt: " + Math.sqrt(16));
        System.out.println("Potencia / Power: " + Math.pow(2, 4));
        System.out.println("Aleatorio / Random: " + Math.random());
    }
}

---

🎯 Notas importantes / Key notes
Math.random() genera un número double entre 0.0 y 1.0
Math.random() generates a double between 0.0 and 1.0

Para generar enteros aleatorios:
To generate random integers:

--java

int aleatorio = (int)(Math.random() * 10); // 0 a 9

Math.pow y Math.sqrt devuelven double
Math.pow and Math.sqrt return a double

```
✅ La clase Math es parte de java.lang, no necesitas importarla.
✅ The Math class is part of java.lang, no import required.