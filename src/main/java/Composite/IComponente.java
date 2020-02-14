package Composite;

public interface IComponente {
    void anadir(IComponente componente);
    void eliminar(IComponente componente);
    void mostrar();
    double getPrecio();
}
