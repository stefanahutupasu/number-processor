package COR;

import Decorator.*;
import Decorator.Number;
import Observer.*;
public class PerfectSquareProcessor extends Processor {

    public PerfectSquareProcessor(Processor nextProcessor){
        super(nextProcessor);
    }

    public void process(Number request)
    {
        PerfectSquareDecorator decoratedNumber = new PerfectSquareDecorator(request);
        if (decoratedNumber.isPerfectSquare())
        {
            System.out.println("Perfect Square : " + request.getNumber());
        }
        else
        {
            System.out.println("Not Perfect Square : " + request.getNumber());
            super.process(request);
        }
    }
}
