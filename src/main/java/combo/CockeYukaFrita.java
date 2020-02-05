package combo;

public class CockeYukaFrita extends ComboBuilder {
    public CockeYukaFrita() {
        super.combo = new Combo();
    }

    @Override
    public void buildCode() {
        combo.code = "C1";
    }

    @Override
    public void buildProduct() {
        combo.products.add(new Product("Cocke", 10.0));
        combo.products.add(new Product("Yuka Frita", 7.0));
    }

    @Override
    public void buildDiscount() {
        combo.discount = 0.05;
    }
}
