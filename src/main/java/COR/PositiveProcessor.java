package COR;
import Decorator.*;
import Decorator.Number;
import Observer.*;

public class PositiveProcessor extends Processor
{

    public PositiveProcessor(Processor nextProcessor){
        super(nextProcessor);
    }

    public void process(Number request)
    {
        if (request.getNumber() > 0)
        {
            System.out.println("Positive: " + request.getNumber());
        }
        else
        {
            super.process(request);
        }
    }
}
