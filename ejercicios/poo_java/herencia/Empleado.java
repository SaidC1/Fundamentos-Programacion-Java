package herencia;

// Empleado hereda de Persona y añade salario
public class Empleado extends Persona {
    private double salario;

    // 1) Constructor por defecto: debe llamar a supero() exprícitamente o implícitamente
    public Empleado() {
        // Llama implícitamente a super() → Persona()
        this.salario = 0.0;
    }

    // 2) Constructor completo: SIEMPRE super(...) debe ir en la PRIMERA línea
    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad); // inicializa la parte Persona
        if (salario < 0) throw new IllegalArgumentException("El salario nu puede ser negativo");
        this.salario = salario;
    }

    public double getSalario() {return salario; }
    public void aumentarSalario(double porcentaje) {
        if(porcentaje < 0) throw new IllegalArgumentException("Porcentaje inválido");
        this.salario += this.salario * (porcentaje / 100.0);
    }
}
