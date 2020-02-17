package Adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("------Guitarra electrica");
        IGuitarra electrica = new IGuitarraElectrica();
        electrica.prender();
        electrica.apagar();

        System.out.println("------Guitarra Acustica");
        electrica = new IGuitarraElectroAcusticaAdapter();
        electrica.prender();
        electrica.apagar();
    }
}
