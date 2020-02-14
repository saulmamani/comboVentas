package FactoryMethod.Product;

public class Oracle implements IConexion {
    private String host;
    private String port;
    private String user;
    private String pass;

    public Oracle() {
        host = "192.168.1.34";
        port = "1521";
        user = "admin";
        pass = "root";
    }

    @Override
    public void conectar() {
        System.out.println("Conectado a Oracle con los parametros: ");
        System.out.println("{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                '}');
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de Oracle");
    }
}
