import combo.*;

import java.util.List;
import java.util.ArrayList;

public class MainVentas {
    public static List<Combo> inventario = new ArrayList<Combo>();
    public static List<Combo> carrito = new ArrayList<Combo>();


    public static void main(String[] args) {
        //utilizando del patron builder
        ComboDirect direct = new ComboDirect();

        ComboBuilder item = new Only("P1", new Product("Cocke", 10.0));
        inventario.add(direct.setComboBuilder(item).buildCombo());

        item = new Only("P2", new Product("Lemonade", 5.0));
        inventario.add(direct.setComboBuilder(item).buildCombo());
        item = new Only("P3", new Product("Plastic Soda Cup", 15.0));
        inventario.add(direct.setComboBuilder(item).buildCombo());
        item = new Only("P4", new Product("Chunky Fries", 10.0));
        inventario.add(direct.setComboBuilder(item).buildCombo());
        item = new Only("P5", new Product("Classic Fries", 12.0));
        inventario.add(direct.setComboBuilder(item).buildCombo());
        item = new Only("P6", new Product("Yuka Frita", 7.0));
        inventario.add(direct.setComboBuilder(item).buildCombo());
        item = new Only("P7", new Product("Cheese Burger", 15.0));
        inventario.add(direct.setComboBuilder(item).buildCombo());
        item = new Only("P8", new Product("Classic Burger", 20.0));
        inventario.add(direct.setComboBuilder(item).buildCombo());
        item = new Only("P9", new Product("ChickenBurger", 25.0));
        inventario.add(direct.setComboBuilder(item).buildCombo());
        item = new Only("P10", new Product("Box", 15.0));
        inventario.add(direct.setComboBuilder(item).buildCombo());
        item = new Only("P11", new Product("Wax Paper", 12.0));
        inventario.add(direct.setComboBuilder(item).buildCombo());

        ComboBuilder c1 = new CockeYukaFrita();
        inventario.add(direct.setComboBuilder(c1).buildCombo());

        ComboBuilder c2 = new LemonadaCheeseBurgerBox();
        inventario.add(direct.setComboBuilder(c2).buildCombo());


        System.out.println("---INVENTARIO---");
        showInventario(inventario);

        System.out.println("\n----- Ventas -----");
        firshSale(inventario, carrito);
        secondSale(inventario, carrito);
        thirdSale(inventario, carrito);
    }

    private static void firshSale(List<Combo> inventario, List<Combo> carrito) {
        System.out.println("***** Primera venta");
        carrito.clear();
        carrito.add(seachCombo("P1", inventario));
        carrito.add(seachCombo("P11", inventario));
        showSale(carrito);
    }

    private static void secondSale(List<Combo> inventario, List<Combo> carrito) {
        System.out.println("***** Segunda venta");
        carrito.clear();
        carrito.add(seachCombo("C1", inventario));
        showSale(carrito);
    }

    private static void thirdSale(List<Combo> inventario, List<Combo> carrito) {
        System.out.println("***** Tercera venta");
        carrito.clear();
        carrito.add(seachCombo("C2", inventario));
        showSale(carrito);
    }


    private static Combo seachCombo(final String codigo, List<Combo> inventario) {
        for (Combo combo : inventario) {
            if (combo.getCode().equals(codigo))
                return combo;
        }
        return null;
    }

    private static void showSale(List<Combo> carrito)
    {
        double total= 0;
        for (Combo combo : carrito) {
            System.out.println(combo);
            total += combo.getCost();
        }
        System.out.println("Total: "  + total);
    }

    private static void showInventario(List<Combo> inventario) {
        for (Combo combo : inventario) {
            System.out.println(combo);
        }
    }
}