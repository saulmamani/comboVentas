package FactoryMethod.Creator;

import FactoryMethod.Product.IConexion;
import FactoryMethod.Product.PostgreSQL;

public class PostgresManager implements IManager {
    @Override
    public IConexion factoryMethod() {
        System.out.println("--- Gestor de base de datos postgreSQL ---");
        return new PostgreSQL();
    }
}
