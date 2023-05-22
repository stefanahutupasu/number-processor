package Decorator;

public class PerfectSquareDecorator extends NumberDecorator {
    public PerfectSquareDecorator(Number decoratedNumber) {
        super(decoratedNumber);
    }

    public boolean isPerfectSquare() {
        int num = decoratedNumber.getNumber();
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
