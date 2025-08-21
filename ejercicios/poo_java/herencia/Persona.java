package herencia;

import java.util.Objects;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        this("Sin nombre", 0); // encadenamos al constructor principal

    }

    public Persona(String nombre, int edad) {
        this.nombre = Objects.requireNonNull(nombre, "nombre no puede ser null").trim();
        if (this.nombre.isEmpty()) this.nombre = "Sin nombre";
        if (edad < 0) throw new IllegalArgumentException("La edad no puede ser negativa");
        this.edad = edad;
    }
    
    public String getNombre() {return nombre; }
    public int getEdad() { return edad; }

    public void complirAños() { this.edad++; }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }
}
