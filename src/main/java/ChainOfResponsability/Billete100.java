package ChainOfResponsability;

public class Billete100 extends CajeroAutomatico {
    @Override
    public void entregarBillete(int monto) {
        int nroBilletes = monto / 100;
        int resto = monto % 100;

        if(nroBilletes > 0)
            System.out.println(nroBilletes +" de 100 Bs.");
        if(resto > 0)
            this.succesor.entregarBillete(resto);
    }
}
