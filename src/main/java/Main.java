import COR.*;
import Factory.ProcessorFactory;
import Interpreter.Interpreter;
import Observer.Subject;

import java.util.Scanner;
import java.util.concurrent.*;

class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {


        Subject subject1 = new Subject();
        ProcessorFactory factory = new ProcessorFactory();
        Chain chain1 = new Chain(subject1, factory.createSignProcessor(), "#Sign Processor notified: ");
        Chain chain2 = new Chain(subject1, factory.createParityProcessor(), "#Parity Processor notified: ");
        Chain chain3 = new Chain(subject1, factory.createPrimePerfectSquareProcessor(), "#Prime/Perfect Square Processor notified: ");
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        Interpreter interpreter = new Interpreter();

        while (true) {
            System.out.print("Enter your number (type 'X' to quit): ");
            String input = scanner.next();
            try {
                interpreter.interpret(input, subject1);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        scanner.close();


    }
}
