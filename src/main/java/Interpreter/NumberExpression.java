package Interpreter;

import Observer.Subject;

public class NumberExpression implements Expression {
    @Override
    public void interpret(String input, Subject subject) {
        try {
            int number = Integer.parseInt(input);
            subject.setNumber(new Decorator.Number(number));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please enter a valid number.");
        }
    }
}