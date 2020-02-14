package FactoryMethod.Creator;

import FactoryMethod.Product.IConexion;
import FactoryMethod.Product.Oracle;

public class OracleManager implements IManager {
    @Override
    public IConexion factoryMethod() {
        System.out.println("--- Gestor de base de datos Oracle ---");
        return new Oracle();
    }
}
