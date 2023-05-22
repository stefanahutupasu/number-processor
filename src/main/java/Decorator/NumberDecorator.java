package Decorator;

public abstract class NumberDecorator extends Number {
    protected Number decoratedNumber;

    public NumberDecorator(Number decoratedNumber) {
        super(decoratedNumber.getNumber());
        this.decoratedNumber = decoratedNumber;
    }
}
