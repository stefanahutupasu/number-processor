package COR;
import Decorator.*;
import Decorator.Number;
import Observer.*;

public class NegativeProcessor extends Processor
{
    public NegativeProcessor(Processor nextProcessor){
        super(nextProcessor);

    }

    public void process(Number request)
    {
        if (request.getNumber() < 0)
        {
            System.out.println("Negative : " + request.getNumber());
        }
        else
        {
            super.process(request);
        }
    }
}