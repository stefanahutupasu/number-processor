package COR;
import Decorator.*;
import Decorator.Number;
import Observer.*;

public class EvenProcessor extends Processor
{
    public EvenProcessor(Processor nextProcessor){
        super(nextProcessor);

    }

    public void process(Number request)
    {
        if (request.getNumber() % 2 == 0)
        {
            System.out.println("Even : " + request.getNumber());
        }
        else
        {
            super.process(request);
        }
    }
}