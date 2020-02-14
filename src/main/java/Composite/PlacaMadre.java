package Composite;

public class PlacaMadre implements IComponente {
    private double precio;

    public PlacaMadre() {
        this.precio = 120;
    }

    @Override
    public void anadir(IComponente componente) {

    }

    @Override
    public void eliminar(IComponente componente) {

    }

    @Override
    public void mostrar() {
        System.out.printf("Item: Placa Madre Intel, Costo: %f\n", this.precio);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
