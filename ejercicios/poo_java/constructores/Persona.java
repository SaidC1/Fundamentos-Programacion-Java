import java.util.Objects;

public class Persona {
    private String nombre;
    private int edad;
    private String email;

    // 1) Constructor por defecto
    public Persona() {
        // Reutilizamos el de 3 parámetros con valores por defecto
        this("Sin nombre", 0, "sin-email@example.com");
    }

    // 2) Constructor 1 parámetro
    public Persona(String nombre) {
        this(nombre, 0, "sin-email@example.com");
    }

    // 3) Constructor con 2 parámetros
    public Persona(String nombre, int edad) {
        this(nombre, edad, "sin-emai@example.com");
    }

    // 4) Constructor completo (punto único)
    public Persona(String nombre, int edad, String email) {
        // Validaciones mínimas
        this.nombre = Objects.requireNonNull(nombre, "nombre no puede ser null").trim();
        if (this.nombre.isEmpty())
            this.nombre = "Sin nombre";

        if (edad < 0)
            throw new IllegalArgumentException("La edad no puede ser negativa");
        this.edad = edad;

        this.email = (email == null || email.isBlank()) ? "sin-email@example.com" : email.trim();
    }

    // Getters / Setters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = (email == null || email.isBlank()) ? this.email : email.trim();
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + ", email='" + email + "'}";
    }
}
