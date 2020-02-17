package ChainOfResponsability;

public abstract class CajeroAutomatico {
    protected CajeroAutomatico succesor;

    public void setSuccesor(CajeroAutomatico succesor)
    {
        this.succesor = succesor;
    }

    public abstract void entregarBillete(int monto);
}
