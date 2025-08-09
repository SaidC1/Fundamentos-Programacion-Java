public class Main {

    public static void main(String[] args) {
        Persona p0 = new Persona();
        Persona p1 = new Persona("Irvin");                                   // por defecto
        Persona p2 = new Persona("Said", 22);                          // 1 Parámetro
        Persona p3 = new Persona("Anam", 30, "ana@mail.com");   //completo

        System.out.println(p0);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }  
}

