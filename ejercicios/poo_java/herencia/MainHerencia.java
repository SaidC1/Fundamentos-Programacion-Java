package poo_java.herencia;

public class MainHerencia {
    public static void main(String[] args) {
        Persona p = new Persona("Irvin", 22);
        Empleado e = new Empleado("Said", 25, 12000);
        Gerente g = new Gerente("Ana", 30, 22000, "Ventas");

        System.out.println(p);
        System.out.println(e);
        System.out.println(g);
