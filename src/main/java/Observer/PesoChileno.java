package Observer;

public class PesoChileno implements IObservador {
    private SujetoConcreto sujeto;
    private double tipoCambio = 1000;

    public PesoChileno(SujetoConcreto sujeto) {
        this.sujeto = sujeto;
        this.sujeto.anadir(this);
    }

    @Override
    public void actualizar() {
        System.out.printf("Peso Chileno: %.2f\n", (this.sujeto.getMonto() * this.tipoCambio));
    }
}
