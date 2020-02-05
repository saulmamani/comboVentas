package combo;

import java.util.ArrayList;
import java.util.List;

public class Combo {
    protected String code;
    protected List<Product> products = new ArrayList<Product>();
    protected double discount = 0.0;
    protected double cost;

    public void setCode(String code) {
        this.code = code;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Code: " + code +
                "\n\t products=" + products +
                "\n\t discount=" + discount +
                ", cost=" + cost;
    }
}
