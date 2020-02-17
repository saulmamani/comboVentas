package Adapter;

public class IGuitarraElectrica implements IGuitarra {
    @Override
    public void prender() {
        System.out.println("Prendido y listo para tocar");
    }

    @Override
    public void apagar() {
        System.out.println("Apagado ya no se puede tocar");
    }
}
