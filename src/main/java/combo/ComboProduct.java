package combo;

import java.util.ArrayList;
import java.util.List;

public class ComboProduct {
    protected String codigo;
    protected List<Product> products = new ArrayList<Product>();
    protected double descuento = 0.0;
    protected double costoVenta;

    public ComboProduct(String codigo, List<Product> products, double descuento) {
        this.codigo = codigo;
        this.products.addAll(products);
        this.descuento = descuento;
        this.setCostoVenta();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCostoVenta() {
        for (Product product : this.products) {
            this.costoVenta += product.getCost();
        }
    }

    public double getCostoVenta() {
        return this.costoVenta - (this.costoVenta * this.descuento);
    }

    @Override
    public String toString() {
        return "Combo:" + codigo +
                "\n\t products=" + products +
                "\n\t descuento=" + descuento +
                "\n\t costoVenta=" + costoVenta;
    }
}
