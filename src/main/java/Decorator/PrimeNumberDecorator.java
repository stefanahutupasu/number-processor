package Decorator;

public class PrimeNumberDecorator extends NumberDecorator {
    public PrimeNumberDecorator(Number decoratedNumber) {
        super(decoratedNumber);
    }

    public boolean isPrime() {
        int num = decoratedNumber.getNumber();
        if (num <= 1) {
            return false;
        }
        if (num == 2) return true;
        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
