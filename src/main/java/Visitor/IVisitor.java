package Visitor;

public interface IVisitor {
    double visit(Normal normal);
    double visit(Estudiante estudiante);
    double visit(Abuelo abuelo);
}
