package Observer;

public interface ISujeto {
    void anadir(IObservador observador);
    void eliminar(IObservador observador);
    void notificar();
}
