package combo;

public class ComboDirector {
    ComboBuilder comboBuilder;

    public Combo getCombo() {
        return comboBuilder.getCombo();
    }

    public void setComboBuilder(ComboBuilder comboBuilder) {
        this.comboBuilder = comboBuilder;
    }

    public void buildCombo() {
        comboBuilder.buildCode();
        comboBuilder.buildProduct();
        comboBuilder.buildDiscount();
        comboBuilder.buildCost();
    }
}
