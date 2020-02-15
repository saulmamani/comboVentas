package Composite;

public class Ram implements IComponente {
    private double precio;

    public Ram() {
        this.precio = 100;
    }

    @Override
    public void anadir(IComponente componente) {

    }

    @Override
    public void eliminar(IComponente componente) {

    }

    @Override
    public void mostrar() {
        System.out.printf("Item: RAM DDR 3 de 8 GB, Costo: %.2f\n", this.precio);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
