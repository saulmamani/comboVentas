package Interpreter;

import java.util.Stack;

public class NoTerminalSuma implements IExpresion {
    @Override
    public void interpretar(Stack<Integer> s) {
        s.push( s.pop() + s.pop() );
    }
}
