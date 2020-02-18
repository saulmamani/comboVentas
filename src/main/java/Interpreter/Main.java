package Interpreter;

public class Main {
    public static void main(String[] args) {
        String expresion = "5 1 +";
        System.out.printf("a) '%s' es igual a %d\n", expresion, + new Contexto(expresion).evaluar());

        expresion = "5 1 -";
        System.out.printf("b) '%s' es igual a %d\n", expresion, + new Contexto(expresion).evaluar());

        expresion = "34 2 1 - +";
        System.out.printf("c) '%s' es igual a %d\n", expresion, + new Contexto(expresion).evaluar());

        expresion = "45 30 + 1 4 - +";
        System.out.printf("d) '%s' es igual a %d\n", expresion, + new Contexto(expresion).evaluar());
    }
}
