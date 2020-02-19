package Visitor;

public class Normal implements ITeleferico{
    private final String descripcion = "Personas normales que usan el teleferico";
    private final double costo = 3;

    public double getCosto() {
        return costo;
    }

    @Override
    public double aceptar(IVisitor visitor) {
        return visitor.visit(this);
    }
}
