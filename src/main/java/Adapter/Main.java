package Adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("------Guitarra electrica");
        Guitarra electrica = new GuitarraElectrica();
        electrica.prender();
        electrica.apagar();

        System.out.println("------Guitarra Acustica");
        electrica = new GuitarraElectroAcusticaAdapter();
        electrica.prender();
        electrica.apagar();
    }
}
