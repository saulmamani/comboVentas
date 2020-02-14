package Decorator.Decoradores;

import Decorator.Cliente;
import Decorator.Cuentas.ICuenta;

public class CuentaDecorator implements ICuenta {
    protected ICuenta cuenta;

    public CuentaDecorator(ICuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void abrirCuenta(Cliente cliente) {
        this.cuenta.abrirCuenta(cliente);
    }
}
