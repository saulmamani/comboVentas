package combo;

public class LemonadaCheeseBurgerBox extends ComboBuilder {
    public LemonadaCheeseBurgerBox() {
        super.combo = new Combo();
    }

    @Override
    public void buildCode() {
        combo.code = "C2";
    }

    @Override
    public void buildProduct() {
        combo.products.add(new Product("Lemonade", 5.0));
        combo.products.add(new Product("Cheese Burger", 15.0));
        combo.products.add(new Product("Box", 15.0));
    }

    @Override
    public void buildDiscount() {
        combo.discount = 0.15;
    }
}
