package ChainOfResponsability;

public class Billete20 extends CajeroAutomatico {
    @Override
    public void entregarBillete(int monto) {
        int nroBilletes = monto / 20;
        int resto = monto % 20;

        if(nroBilletes > 0)
            System.out.println(nroBilletes +" de 20 Bs.");
        if(resto > 0)
            this.succesor.entregarBillete(resto);
    }
}
