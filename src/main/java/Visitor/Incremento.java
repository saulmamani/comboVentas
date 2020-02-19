package Visitor;

public class Incremento implements IVisitor {
    @Override
    public double visit(Normal normal) {
        return normal.getCosto() + 0.5;
    }

    @Override
    public double visit(Estudiante estudiante) {
        return estudiante.getCosto() + 2;
    }

    @Override
    public double visit(Abuelo abuelo) {
        return abuelo.getCosto() + 0.5;
    }
}
