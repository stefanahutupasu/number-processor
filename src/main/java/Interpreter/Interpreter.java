package Interpreter;

import Observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class Interpreter {
    private List<Expression> expressions;

    public Interpreter() {
        expressions = new ArrayList<>();
        expressions.add(new QuitExpression());
        expressions.add(new NumberExpression());

    }

    public void interpret(String input, Subject subject) {
        for (Expression expression : expressions) {
            expression.interpret(input, subject);
        }
    }
}
