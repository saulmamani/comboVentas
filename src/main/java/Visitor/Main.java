package Visitor;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Costo normal de los pasajes: (En horarios fuera de oficina)");
        Normal normal = new Normal();
        Estudiante estudiante = new Estudiante();
        Abuelo abuelo = new Abuelo();
        System.out.printf("Clientes normales: %.2f, Estudidantes: %.2f, Abuelos: %.2f\n", normal.getCosto(), estudiante.getCosto(), abuelo.getCosto());

        System.out.println("---Costo con descuento: (En horarios de oficina)");
        IVisitor descuento = new Descuento();
        System.out.printf("Clientes normales: %.2f, Estudidantes: %.2f, Abuelos: %.2f\n", normal.aceptar(descuento), estudiante.aceptar(descuento), abuelo.aceptar(descuento));

        System.out.println("---Costo con incremento: (Fines de semana y dias festivos)");
        IVisitor incremento = new Incremento();
        System.out.printf("Clientes normales: %.2f, Estudidantes: %.2f, Abuelos: %.2f\n", normal.aceptar(incremento), estudiante.aceptar(incremento), abuelo.aceptar(incremento));
    }
}
