import combo.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainVentas {
    public static List<ComboProduct> inventario = new ArrayList<ComboProduct>();
    public static List<ComboProduct> carrito = new ArrayList<ComboProduct>();


    public static void main(String[] args) {

        inventario.add(Only.getCombo("P1", new Product("Cocke", 10.0)));
        inventario.add(Only.getCombo("P2", new Product("Lemonade", 5.0)));
        inventario.add(Only.getCombo("P3", new Product("Plastic Soda Cup", 15.0)));

        inventario.add(Only.getCombo("P4", new Product("Chunky Fries", 10.0)));
        inventario.add(Only.getCombo("P5", new Product("Classic Fries", 12.0)));
        inventario.add(Only.getCombo("P6", new Product("Yuka Frita", 7.0)));
        inventario.add(Only.getCombo("P7", new Product("Cheese Burger", 15.0)));
        inventario.add(Only.getCombo("P8", new Product("Classic Burger", 20.0)));
        inventario.add(Only.getCombo("P9", new Product("ChickenBurger", 25.0)));
        inventario.add(Only.getCombo("P10", new Product("Box", 15.0)));
        inventario.add(Only.getCombo("P11", new Product("Wax Paper", 12.0)));

        inventario.add(CockeYukaFrita.getCombo("C1"));
        inventario.add(LemonadaCheeseBurgerBox.getCombo("C2"));

        System.out.println("INVENTARIO");
        showInventario(inventario);

        System.out.println("----- Ventas -----");
        firshSale(inventario, carrito);
        secondSale(inventario, carrito);
        thirdSale(inventario, carrito);
    }

    private static void firshSale(List<ComboProduct> inventario, List<ComboProduct> carrito) {
        System.out.println("***** Primera venta");
        carrito.clear();
        carrito.add(seachCombo("P1", inventario));
        carrito.add(seachCombo("P11", inventario));
        showSale(carrito);
    }

    private static void secondSale(List<ComboProduct> inventario, List<ComboProduct> carrito) {
        System.out.println("***** Segunda venta");
        carrito.clear();
        carrito.add(seachCombo("C1", inventario));
        showSale(carrito);
    }

    private static void thirdSale(List<ComboProduct> inventario, List<ComboProduct> carrito) {
        System.out.println("***** Tercera venta");
        carrito.clear();
        carrito.add(seachCombo("C2", inventario));
        showSale(carrito);
    }


    private static ComboProduct seachCombo(final String codigo, List<ComboProduct> inventario) {
        for (ComboProduct combo : inventario) {
            if (combo.getCodigo().equals(codigo))
                return combo;
        }
        return null;
    }

    private static void showSale(List<ComboProduct> carrito)
    {
        double total= 0;
        for (ComboProduct combo : carrito) {
            System.out.println(combo);
            total += combo.getCostoVenta();
        }
        System.out.println("Total: "  + total);
    }

    private static void showInventario(List<ComboProduct> inventario) {
        for (ComboProduct combo : inventario) {
            System.out.println(combo);
        }
    }
}