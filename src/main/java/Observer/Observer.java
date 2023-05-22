package Observer;
import Decorator.*;
import COR.*;
import Decorator.Number;

public interface Observer {
    void update(Number number);
}