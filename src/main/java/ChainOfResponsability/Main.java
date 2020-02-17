package ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        CajeroAutomatico b200 = new Billete200();
        CajeroAutomatico b100 = new Billete100();
        CajeroAutomatico b50 = new Billete50();
        CajeroAutomatico b20 = new Billete20();
        CajeroAutomatico b10 = new Billete10();

        b200.setSuccesor(b100);
        b100.setSuccesor(b50);
        b50.setSuccesor(b20);
        b20.setSuccesor(b10);

        System.out.println("Retirar 250 Bs");
        b200.entregarBillete(250);

        System.out.println("Retirar 180 Bs");
        b200.entregarBillete(180);

        System.out.println("Retirar 530 Bs");
        b200.entregarBillete(530);
    }
}
