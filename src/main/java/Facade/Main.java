package Facade;

public class Main {
    public static void main(String[] args) {
        Facade solicitud_1 = new Facade();
        solicitud_1.buscar("01/01/2020", "30/03/2020", "Oruro", "Pando");

        Facade solicitud_2 = new Facade();
        solicitud_2.buscar("02/02/2020", "25/02/2020", "Oruro", "Tarija");
    }
}
