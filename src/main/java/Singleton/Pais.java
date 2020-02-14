package Singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pais {
    private static Pais instance = null;

    private Pais() { }

    public static Pais getInstance() {
        if(instance == null)
            instance = new Pais();
        return instance;
    }

    public List<String> listar() {
        return Arrays.asList("Bolivia", "Perú", "Francia", "Estados Unidos", "Alemania");
    }

    public List<String> listarIngles() {
        return Arrays.asList("Bolivia", "Peru", "France", "USA (United States of America)", "Germany");
    }
}
