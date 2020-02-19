package Visitor;

public class Abuelo implements ITeleferico {
    private final String descripcion = "Personas de la tercera edad";
    private final double costo = 2;

    public double getCosto() {
        return costo;
    }

    @Override
    public double aceptar(IVisitor visitor) {
        return visitor.visit(this);
    }
}
