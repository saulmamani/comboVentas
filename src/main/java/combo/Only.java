package combo;

import java.util.ArrayList;
import java.util.List;

public class Only {

    public static ComboProduct getCombo(String code, Product product) {
        List<Product> item = new ArrayList<Product>();
        item.add(product);
        return new ComboProduct(code, item, 0);
    }
}
