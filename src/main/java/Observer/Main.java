package Observer;

public class Main {
    public static void main(String[] args)
    {
        SujetoConcreto sujeto = new SujetoConcreto();
        new NuevoSol(sujeto);
        new PesoChileno(sujeto);

        System.out.println("Convertir 10 Bolivianos a soles y pesos chilenos");
        sujeto.convertir(10);

        System.out.println("Convertir 50 Bolivianos a soles y pesos chilenos");
        sujeto.convertir(50);
    }
}
