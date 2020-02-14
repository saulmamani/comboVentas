package Decorator;

import Decorator.Cuentas.CuentaCajaAhorro;
import Decorator.Cuentas.CuentaCorriente;
import Decorator.Cuentas.ICuenta;
import Decorator.Decoradores.TarjetaDeCredito;
import Decorator.Decoradores.TarjetaDeDebito;

public class Main {
    public static void main(String[] args)
    {
        // cliente con solo caja de ahorro
        Cliente juan = new Cliente("Juan", "Perez Quispe");
        ICuenta cuenta = new CuentaCajaAhorro();
        cuenta.abrirCuenta(juan);

        //cliente con solo cuenta de ahorro
        Cliente pedro = new Cliente("Pedro", "Mamani Llanos");
        cuenta = new CuentaCorriente();
        cuenta.abrirCuenta(pedro);

        //cliente con cuenta de caja de ahorros, tarjeta de debito
        Cliente lidia = new Cliente("Lidia", "Marce Morales");
        cuenta = new CuentaCajaAhorro();
        ICuenta tarjetaDeDebito = new TarjetaDeDebito(cuenta);
        tarjetaDeDebito.abrirCuenta(lidia);

        //cliente con cuenta de cuenta corriente y tarjeta de credito
        Cliente saul = new Cliente("Saul", "Mamani M.");
        cuenta = new CuentaCorriente();
        ICuenta tarjetaDeCredito = new TarjetaDeCredito(cuenta);
        tarjetaDeCredito.abrirCuenta(saul);
    }
}
