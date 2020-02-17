package ChainOfResponsability;

public class Billete50 extends CajeroAutomatico {
    @Override
    public void entregarBillete(int monto) {
        int nroBilletes = monto / 50;
        int resto = monto % 50;

        if(nroBilletes > 0)
            System.out.println(nroBilletes +" de 50 Bs.");
        if(resto > 0)
            this.succesor.entregarBillete(resto);
    }
}
