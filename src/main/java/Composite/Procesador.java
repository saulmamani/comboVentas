package Composite;

public class Procesador implements IComponente {
    private double precio;

    public Procesador() {
        this.precio = 500;
    }

    @Override
    public void anadir(IComponente componente) {

    }

    @Override
    public void eliminar(IComponente componente) {

    }

    @Override
    public void mostrar() {
        System.out.printf("Item: Procesador SnapDragon, Costo: %f\n", this.precio);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
