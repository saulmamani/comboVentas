package Observer;

import java.util.ArrayList;
import java.util.List;

public class SujetoConcreto implements ISujeto {

    private List<IObservador> observadors = new ArrayList<>();
    private int monto;

    public int getMonto() {
        return monto;
    }

    public void convertir(int estado){
        this.monto = estado;
        this.notificar();
    }

    @Override
    public void anadir(IObservador observador) {
        this.observadors.add(observador);
    }

    @Override
    public void eliminar(IObservador observador) {
        this.observadors.remove(observador);
    }

    @Override
    public void notificar() {
        this.observadors.forEach(x -> x.actualizar());
    }
}
