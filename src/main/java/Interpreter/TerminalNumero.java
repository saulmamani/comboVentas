package Interpreter;

import java.util.Stack;

public class TerminalNumero implements IExpresion {
    private int numero;

    public TerminalNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void interpretar(Stack<Integer> s) {
        s.push(this.numero);
    }
}
