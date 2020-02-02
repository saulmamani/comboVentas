import combo.*;

import java.util.List;
import java.util.ArrayList;

public class MainVentas {
    public static List<ComboProduct> inventario = new ArrayList<ComboProduct>();

    public static void main(String[] args)
    {

        inventario.add(Only.getCombo("P1",  new Product("Cocke", 10.0)));
        inventario.add(Only.getCombo("P2",  new Product("Lemonade", 5.0)));
        inventario.add(Only.getCombo("P3",  new Product("Plastic Soda Cup", 15.0)));

        inventario.add(Only.getCombo("P4",  new Product("Chunky Fries", 10.0)));
        inventario.add(Only.getCombo("P5",  new Product("Classic Fries", 12.0)));
        inventario.add(Only.getCombo("P6",  new Product("Yuka Frita", 7.0)));
        inventario.add(Only.getCombo("P7",  new Product("Cheese Burger", 15.0)));
        inventario.add(Only.getCombo("P8",  new Product("Classic Burger", 20.0)));
        inventario.add(Only.getCombo("P9",  new Product("ChickenBurger", 25.0)));
        inventario.add(Only.getCombo("P10", new Product("Box", 15.0)));
        inventario.add(Only.getCombo("P11", new Product("Wax Paper", 12.0)));

        inventario.add(CockeYukaFrita.getCombo("C1"));
        inventario.add(LemonadaCheeseBurgerBox.getCombo("C2"));

        System.out.println("INVENTARIO");
        showInventario(inventario);
    }

    private static void showInventario(List<ComboProduct> inventario) {
        for(ComboProduct combo : inventario) {
            System.out.println(combo);
        }
    }
}