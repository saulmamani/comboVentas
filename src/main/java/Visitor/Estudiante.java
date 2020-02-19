package Visitor;

public class Estudiante implements ITeleferico {
    private final String descripcion = "Estudiantes escolares y universitarios";
    private final double costo = 1.5;

    public double getCosto() {
        return costo;
    }

    @Override
    public double aceptar(IVisitor visitor) {
        return visitor.visit(this);
    }
}
