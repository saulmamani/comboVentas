package Interpreter;

import java.util.Stack;

public class NoTerminalResta implements IExpresion {
    @Override
    public void interpretar(Stack<Integer> s) {
        int temp = s.pop();
        s.push(s.pop() - temp);
    }
}
