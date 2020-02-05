package combo;

public abstract class ComboBuilder {
    protected Combo combo;

    public Combo getCombo() {
        return combo;
    }

    public abstract void buildCode();
    public abstract void buildProduct();
    public abstract void buildDiscount();
    public void buildCost(){
        double total = combo.products.stream().mapToDouble(o -> o.getCost()).sum();
        combo.cost = total - (total * combo.discount);
    };
}
