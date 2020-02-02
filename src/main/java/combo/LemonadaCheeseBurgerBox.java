package combo;

import java.util.ArrayList;
import java.util.List;

public class LemonadaCheeseBurgerBox {

    public static ComboProduct getCombo(String code) {
        List<Product> items = new ArrayList<Product>();
        items.add(new Product("Lemonade", 5.0));
        items.add(new Product("Cheese Burger", 15.0));
        items.add(new Product("Box", 15.0));

        return new ComboProduct(code, items, 0.15);
    }
}
