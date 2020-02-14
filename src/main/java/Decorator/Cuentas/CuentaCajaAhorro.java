package Decorator.Cuentas;

import Decorator.Cliente;

public class CuentaCajaAhorro implements ICuenta {
    private double interez = 0.03;
    @Override
    public void abrirCuenta(Cliente cliente) {
        System.out.println("-----| Nueva cuenta Caja de Ahorros");
        System.out.printf("Cliente: %s\nInterez: %f\n", cliente.getNombreCompleto(), this.interez);
    }
}
