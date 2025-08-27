package poo_java.herencia;

import java.util.Objects;

// Gerente extiende Empleado y agrega departamento
public class Gerente extends Empleado {
    private String departamento;

    public Gerente() {
        // Llama a Empleado() y luego setea departamento
        super();
        this.departamento = "Sin departamento";
    }

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario); // sub-objeto Empleado/Persona
        this.departamento = (Objects.requireNonNullElse(departamento, "")).trim();
        if (this.departamento.isEmpty()) this.departamento = "Sin departamento";
    }

    public String getDepartamento() { return departamento; }

    // Sobrescritura con super.toString() para reusar formato
    @Override
    public String toString() {
        return "Gerente{" +
                "base=" + super.toString() +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
