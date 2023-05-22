package Interpreter;

import Observer.Subject;

public interface Expression {
    void interpret(String input, Subject subject);
}
