package Observer;

public class NuevoSol implements IObservador {
    private SujetoConcreto sujeto;
    private double tipoCambio = 2.14;

    public NuevoSol(SujetoConcreto sujeto) {
        this.sujeto = sujeto;
        this.sujeto.anadir(this);
    }

    @Override
    public void actualizar() {
        System.out.printf("PEN: %.2f\n", (this.sujeto.getMonto() / this.tipoCambio));
    }
}
