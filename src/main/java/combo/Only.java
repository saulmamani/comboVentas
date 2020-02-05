package combo;

public class Only extends ComboBuilder {
    private String code;
    private Product product;

    public Only(String code, Product product) {
        super.combo = new Combo();
        this.code = code;
        this.product = product;
    }

    @Override
    public void buildCode() {
        combo.code = this.code;
    }

    @Override
    public void buildProduct() {
        combo.products.add(product);
    }

    @Override
    public void buildDiscount() {
        combo.discount = 0;
    }
}
