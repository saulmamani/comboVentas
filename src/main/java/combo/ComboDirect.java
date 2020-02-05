package combo;

public class ComboDirect {
    ComboBuilder comboBuilder;

    public ComboDirect setComboBuilder(ComboBuilder comboBuilder) {
        this.comboBuilder = comboBuilder;
        return this;
    }

    public Combo buildCombo() {
        comboBuilder.buildCode();
        comboBuilder.buildProduct();
        comboBuilder.buildDiscount();
        comboBuilder.buildCost();

        return comboBuilder.getCombo();
    }
}
