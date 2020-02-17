package ChainOfResponsability;

public class Billete10 extends CajeroAutomatico {
    @Override
    public void entregarBillete(int monto) {
        int nroBilletes = monto / 10;
        int resto = monto % 10;

        if(nroBilletes > 0)
            System.out.println(nroBilletes +" de 10 Bs.");
        if(resto > 0)
            this.succesor.entregarBillete(resto);
    }
}
