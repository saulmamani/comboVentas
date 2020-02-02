import combo.Combo;
import combo.Product;

import java.util.List;
import java.util.ArrayList;

public class MainVentas {
    public static List<Combo> inventario = new ArrayList<Combo>();

    public static void main(String[] args)
    {
        List<Product> B1 = new ArrayList<Product>();
        B1.add(new Product("Cocke", 10.0));
        inventario.add(new Combo("B1", B1, 0));

        List<Product> B2 = new ArrayList<Product>();
        B2.add(new Product("Lemonade", 5.0));
        inventario.add(new Combo("B2", B2, 0));

        List<Product> Combo1 = new ArrayList<Product>();
        Combo1.add(new Product("Lemonade", 5.0));
        Combo1.add(new Product("Cheese Burger", 15.0));
        inventario.add(new Combo("Combo1", Combo1, 0.05));




//        inventario.add(new Product[]{new Product("Cocke", 10.0), new Product("Cocke", 10.0)});
//
//        inventario.add(new Product("Lemonade", 5.0));
//        inventario.add(new Product("Plastic Soda Cup", 15.0));
//
//        inventario.add(new Product("Chunky Fries", 10.0));
//        inventario.add(new Product("Classic Fries", 12.0));
//        inventario.add(new Product("Yuka Frita", 7.0));
//        inventario.add(new Product("Cheese Burger", 15.0));
//        inventario.add(new Product("Classic Burger", 20.0));
//        inventario.add(new Product("ChickenBurger", 25.0));
//        inventario.add(new Product("Box", 15.0));
//        inventario.add(new Product("Wax Paper", 12.0));
    }
}