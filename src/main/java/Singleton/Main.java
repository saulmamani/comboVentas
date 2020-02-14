package Singleton;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> paises = Pais.getInstance().listar();
        List<String> countries = Pais.getInstance().listarIngles();

        System.out.println("**** Lista de paises ****");
        listar(paises);
        System.out.println("**** List of countries ****");
        listar(countries);
    }

    private static void listar(List<String> paises) {
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
}
