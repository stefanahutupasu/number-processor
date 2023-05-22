package COR;
import Decorator.Number;
import Observer.*;

public class Chain implements Observer {
    Processor chain;
    Subject numberSubject;
    String message;

    public Chain(Subject numberSubject, Processor processor, String message){
        this.chain = processor;
        this.numberSubject = numberSubject;
        this.message = message;
        this.numberSubject.attach(this);
    }

    /*private void buildChain(){
        chain = new COR.NegativeProcessor(new COR.ZeroProcessor(new COR.PositiveProcessor(null)));
    }*/

    public void process(Number request) {
        chain.process(request);
    }

    @Override
    public void update(Number number) {
        System.out.println(message + number.getNumber());
        process(number);
    }
}