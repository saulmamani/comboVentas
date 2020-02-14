package Composite;

public class LectorDVD implements IComponente {
    private double precio;

    public LectorDVD() {
        this.precio = 50;
    }

    @Override
    public void anadir(IComponente componente) {

    }

    @Override
    public void eliminar(IComponente componente) {

    }

    @Override
    public void mostrar() {
        System.out.printf("Item: Lector de DVD LG, Costo: %f\n", this.precio);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
