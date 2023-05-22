package Factory;

import COR.*;

public class ProcessorFactory {
    public Processor createSignProcessor() {
        return new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
    }

    public Processor createParityProcessor() {
        return new EvenProcessor(new OddProcessor(null));
    }

    public Processor createPrimePerfectSquareProcessor() {
        return new PrimeProcessor(new PerfectSquareProcessor(null));
    }
}
