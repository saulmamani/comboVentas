package Decorator.Decoradores;

import Decorator.Cliente;
import Decorator.Cuentas.ICuenta;

public class TarjetaDeDebito extends CuentaDecorator {
    public TarjetaDeDebito(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void abrirCuenta(Cliente cliente) {
        super.abrirCuenta(cliente);
        agregarTarjetaDeDebito();
    }

    private void agregarTarjetaDeDebito() {
        System.out.println("Se ha agregado tarjeta de debito a la cuenta");
    }
}
