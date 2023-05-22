package Interpreter;

import Observer.Subject;

public class QuitExpression implements Expression {
    @Override
    public void interpret(String input, Subject subject) {
        if (input.equalsIgnoreCase("X")) {
            throw new RuntimeException("Quitting program...");
        }
    }
}