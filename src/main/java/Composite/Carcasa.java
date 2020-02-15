package Composite;

public class Carcasa implements IComponente {
    private double precio;

    public Carcasa() {
        this.precio = 10;
    }

    @Override
    public void anadir(IComponente componente) {

    }

    @Override
    public void eliminar(IComponente componente) {

    }

    @Override
    public void mostrar() {
        System.out.printf("Item: Carcasa de PC, Costo: %.2f\n", this.precio);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
