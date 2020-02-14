package Decorator.Cuentas;

import Decorator.Cliente;

public class CuentaCorriente implements ICuenta {
    private double interez = 0.5;
    private int plazoFijoAnios = 10;
    @Override
    public void abrirCuenta(Cliente cliente) {
        System.out.println("----- Nueva cuenta corriente abierta");
        System.out.printf("Cliente: %s\nInterez: %f, Plazo fijo: %d \n", cliente.getNombreCompleto(), this.interez, this.plazoFijoAnios);
    }
}
