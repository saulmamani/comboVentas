package Adapter;

public class IGuitarraElectroAcusticaAdapter implements IGuitarra {
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
