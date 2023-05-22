package COR;
import Decorator.*;
import Decorator.Number;
import Observer.*;

public class OddProcessor extends Processor
{
    public OddProcessor(Processor nextProcessor){
        super(nextProcessor);

    }

    public void process(Number request)
    {
        if (request.getNumber() % 2 != 0)
        {
            System.out.println("Odd : " + request.getNumber());
        }
        else
        {
            super.process(request);
        }
    }
}