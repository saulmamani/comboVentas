package FactoryMethod.Product;

public class MySQL implements IConexion {
    private String host;
    private String port;
    private String user;
    private String pass;

    public MySQL() {
        host = "192.168.1.3";
        port = "3306";
        user = "root";
        pass = "root";
    }

    @Override
    public void conectar() {
        System.out.println("Conectado a MySQL con los parametros: ");
        System.out.println("{" +
                    "host='" + host + '\'' +
                    ", port='" + port + '\'' +
                    ", user='" + user + '\'' +
                    ", pass='" + pass + '\'' +
                '}');
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de MySQL");
    }
}
