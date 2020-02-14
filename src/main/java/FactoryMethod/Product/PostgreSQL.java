package FactoryMethod.Product;

public class PostgreSQL implements IConexion {
    private String host;
    private String port;
    private String user;
    private String pass;

    public PostgreSQL() {
        host = "192.168.1.51";
        port = "5432";
        user = "postgres";
        pass = "root";
    }

    @Override
    public void conectar() {
        System.out.println("Conectado a postgreSQL con los parametros: ");
        System.out.println("{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                '}');
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de postgreSQL");
    }
}
