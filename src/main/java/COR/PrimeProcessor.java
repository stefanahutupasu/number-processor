package COR;

import Decorator.*;
import Decorator.Number;
import Observer.*;

public class PrimeProcessor extends Processor
{
    public PrimeProcessor(Processor nextProcessor){
        super(nextProcessor);

    }

    public void process(Number request)
    {
        PrimeNumberDecorator decoratedNumber = new PrimeNumberDecorator(request);
        if (decoratedNumber.isPrime())
        {
            System.out.println("Prime : " + request.getNumber());
        }
        else
        {
            System.out.println("Not Prime : " + request.getNumber());
            super.process(request);
        }
    }
}