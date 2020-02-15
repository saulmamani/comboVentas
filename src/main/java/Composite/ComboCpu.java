package Composite;

public class ComboCpu {
    private double descuento;
    IComponente componente = new Compuesto();

    public ComboCpu() {
        this.descuento = 0.05;
        this.componente.anadir(new PlacaMadre());
        this.componente.anadir(new Procesador());
        this.componente.anadir(new LectorDVD());
        this.componente.anadir(new Ram());
        this.componente.anadir(new Carcasa());
    }

    public void mostrar()
    {
        this.componente.mostrar();
        double total = this.componente.getPrecio() - (this.componente.getPrecio() * this.descuento);
        System.out.printf("Costo Total con descuento del %.2f es de: %.2f\n", this.descuento, total);
    }
}
