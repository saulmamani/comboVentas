package ChainOfResponsability;

public class Billete200 extends CajeroAutomatico {
    @Override
    public void entregarBillete(int monto) {
        int nroBilletes = monto / 200;
        int resto = monto % 200;

        if(nroBilletes > 0)
            System.out.println(nroBilletes +" de 200 Bs.");
        if(resto > 0)
            this.succesor.entregarBillete(resto);
    }
}
