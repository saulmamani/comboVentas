package FactoryMethod;

import FactoryMethod.Creator.IManager;
import FactoryMethod.Creator.MySQLManager;
import FactoryMethod.Creator.OracleManager;
import FactoryMethod.Creator.PostgresManager;
import FactoryMethod.Product.IConexion;
import FactoryMethod.Product.MySQL;
import FactoryMethod.Product.Oracle;
import FactoryMethod.Product.PostgreSQL;

public class Main {
    public static void main(String[] args) {
        IManager manager = new MySQLManager();
        MySQL mySQL = (MySQL) manager.factoryMethod();
        mySQL.conectar();
        mySQL.desconectar();

        manager = new PostgresManager();
        PostgreSQL postgreSQL = (PostgreSQL) manager.factoryMethod();
        postgreSQL.conectar();
        postgreSQL.desconectar();

        manager = new OracleManager();
        Oracle oracle = (Oracle) manager.factoryMethod();
        oracle.conectar();
        oracle.desconectar();
    }
}