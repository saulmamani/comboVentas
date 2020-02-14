package FactoryMethod.Creator;

import FactoryMethod.Product.IConexion;
import FactoryMethod.Product.MySQL;

public class MySQLManager implements IManager {
    @Override
    public IConexion factoryMethod() {
        System.out.println("--- Gestor de base de datos MySQL ---");
        return new MySQL();
    }
}
