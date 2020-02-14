package Adapter;

public class GuitarraElectroAcusticaAdapter implements Guitarra {
    GuitarraAcustica acustica = new GuitarraAcustica();

    @Override
    public void prender() {
        acustica.tocar();
    }

    @Override
    public void apagar() {
        acustica.dejaDeTocar();
    }
}
