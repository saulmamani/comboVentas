package Composite;

import java.util.ArrayList;
import java.util.List;

public class Compuesto implements IComponente {
    private List<IComponente> hijos = new ArrayList<>();

    @Override
    public void anadir(IComponente componente) {
        this.hijos.add(componente);
    }

    @Override
    public void eliminar(IComponente componente) {
        this.hijos.remove(componente);
    }

    @Override
    public void mostrar() {
        double total = 0;
        for(IComponente componente : hijos)
        {
            componente.mostrar();
        }
        System.out.printf("Costo Total: %.2f\n", this.getPrecio());
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for(IComponente componente : hijos)
        {
            total += componente.getPrecio();
        }
        return total;
    }
}
