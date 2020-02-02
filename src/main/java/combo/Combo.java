package combo;

import java.util.ArrayList;
import java.util.List;

public class Combo {
    protected List<Product> products = new ArrayList<Product>();
    protected String codigo;
    protected double descuento = 0.0;
    protected double costoVenta;

    public Combo(String codigo, List<Product> products, double descuento) {
        this.codigo = codigo;
        this.products.addAll(products);
        this.descuento = descuento;
    }

    public void setCostoVenta() {
        for (Product product : this.products) {
            this.costoVenta += product.getCost();
        }
    }

    public double getCostoVenta() {
        return this.costoVenta - (this.costoVenta * this.descuento);
    }
}
