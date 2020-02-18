package Interpreter;

import java.util.ArrayList;
import java.util.Stack;

public class Contexto {
    private ArrayList<IExpresion> arbol = new ArrayList<IExpresion>();

    public Contexto(String s) {
        for (String token : s.split(" ")) {
            if (token.equals("+"))
                arbol.add(new NoTerminalSuma());
            else if (token.equals("-"))
                arbol.add(new NoTerminalResta());
            else
                arbol.add(new TerminalNumero(Integer.parseInt(token)));
        }
    }

    public int evaluar() {
        Stack<Integer> context = new Stack<>();
        for (IExpresion e : arbol)
            e.interpretar(context);
        return context.pop();
    }
}
