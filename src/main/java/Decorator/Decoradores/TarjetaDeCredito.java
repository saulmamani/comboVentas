package Decorator.Decoradores;

import Decorator.Cliente;
import Decorator.Cuentas.ICuenta;

public class TarjetaDeCredito extends CuentaDecorator {
    public TarjetaDeCredito(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void abrirCuenta(Cliente cliente) {
        super.abrirCuenta(cliente);
        this.agregarTarjetaDeCredito();
    }

    private void agregarTarjetaDeCredito() {
        System.out.println("Se ha agregado tarjeta de credito a esta cuenta");
    }
}
