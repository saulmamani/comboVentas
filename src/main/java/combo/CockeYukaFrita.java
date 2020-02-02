package combo;

import java.util.ArrayList;
import java.util.List;

public class CockeYukaFrita {
    public static ComboProduct getCombo(String code) {
        List<Product> items = new ArrayList<Product>();
        items.add(new Product("Cocke", 10.0));
        items.add(new Product("Yuka Frita", 7.0));
        
        return new ComboProduct(code, items, 0.05);
    }
}
