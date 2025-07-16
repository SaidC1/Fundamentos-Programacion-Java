# 📅 Manejo de Fechas en Java / Date Handling in Java

Java ofrece varias clases para trabajar con **fechas, horas y tiempo**.  
Java provides several classes to work with **dates, time, and time zones**.

---

## ✅ Clases modernas (Java 8+)

Desde Java 8 es recomendable usar el paquete `java.time`.  
Since Java 8, it’s recommended to use the `java.time` package.

- `LocalDate` → solo fecha (YYYY-MM-DD)  
- `LocalTime` → solo hora (HH:MM:SS)  
- `LocalDateTime` → fecha y hora  
- `DateTimeFormatter` → formatear fechas  

---

## 🧪 Ejemplo básico con `LocalDate`

```java
import java.time.LocalDate;

public class FechaBasica {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now(); // fecha actual
        System.out.println("Hoy es: " + hoy);

        LocalDate fechaEspecifica = LocalDate.of(2025, 7, 16);
        System.out.println("Fecha específica: " + fechaEspecifica);
    }
}

Salida / Output:

Hoy es: 2025-07-16
Fecha específica: 2025-07-16

---

🧪 Ejemplo con LocalDateTime

import java.time.LocalDateTime;

public class FechaHora {
    public static void main(String[] args) {
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + ahora);
    }
}

---

🖌️ Formatear fechas con DateTimeFormatter

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatoFecha {
    public static void main(String[] args) {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        String fechaFormateada = ahora.format(formato);
        System.out.println("Fecha formateada: " + fechaFormateada);
    }
}

Salida ejemplo:

Fecha formateada: 16/07/2025 22:30

---

🔄 Sumar o restar días/meses/años

import java.time.LocalDate;

public class SumarRestarFechas {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();

        LocalDate enUnaSemana = hoy.plusDays(7);
        LocalDate haceUnMes = hoy.minusMonths(1);

        System.out.println("Hoy: " + hoy);
        System.out.println("En una semana: " + enUnaSemana);
        System.out.println("Hace un mes: " + haceUnMes);
    }
}

---

⚠️ Fechas antiguas con java.util.Date
Antes de Java 8 se usaba Date y Calendar, pero son menos recomendados hoy.
Before Java 8, Date and Calendar were used, but they’re less recommended now.

---

📌 Resumen rápido
✅ Usa LocalDate, LocalTime, LocalDateTime para trabajar con fechas y horas.
✅ Usa DateTimeFormatter para formatear la salida.
✅ Puedes sumar/restar días, meses o años fácilmente con .plusDays() y .minusMonths().

---


---

Con esto ya tendrías **manejo de fechas** listo.  

Ahora tu carpeta `guia-teorica/` queda **completa con todo lo que hemos hecho**.  

¿Quieres que sigamos con el siguiente tema **`scanner-input`** para aprender cómo leer datos del usuario?
