# Constructores en Java (POO)

Un **constructor** inicializa el objeto al crearlo con `new`.  
Reglas clave:
- Se llama igual que la clase y **no** tiene tipo de retorno.
- Puedes **sobrecargar** (varios con distinta lista de parámetros).
- Puedes **encadenar** usando `this(...)`.
- Si no declaras ninguno, Java crea uno **por defecto** sin parámetros.

## Ejemplos del proyecto
- `Persona.java`: muestra sobrecarga, validaciones y `this(...)`.
- `Main.java`: crea 4 instancias con distintos constructores.

## Buenas prácticas
- Evita duplicar lógica: usa un **constructor principal** y llama con `this(...)`.
- Valida entradas (null, vacíos, rangos).
- Mantén campos **privados** y provee getters/setters.
- Si hay herencia, recuerda `super(...)` como **primera línea**.

## Tareas rápidas
1. Agrega un constructor que reciba solo `email`.
2. Lanza excepción si `email` no contiene `@`.
3. Crea una clase `Alumno(nombre, edad, carrera)` con:
   - constructor por defecto que llame al completo con valores por defecto,
   - `toString()` y un `Main` que lo pruebe.
