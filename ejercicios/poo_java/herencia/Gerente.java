package poo_java.herencia;

import java.util.Objects;

// Gerente extiende Empleado y agrega departamento
public class Gerente extends Empleado {
    private String departamento;

    public Gerente () {
        // Llama a Empleado() y luego setea departamento
        super();
        this.departamento = "Sin departamento";
    }
    
}
