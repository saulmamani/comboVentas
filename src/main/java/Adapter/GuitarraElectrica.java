package Adapter;

public class GuitarraElectrica implements Guitarra {
    @Override
    public void prender() {
        System.out.println("Prendido y listo para tocar");
    }

    @Override
    public void apagar() {
        System.out.println("Apagado ya no se puede tocar");
    }
}
