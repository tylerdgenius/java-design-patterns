package observerpattern;

import java.util.ArrayList;
import java.util.List;
import observerpattern.Interfaces.Consumer;
import observerpattern.Interfaces.IProducer;

public class Producer implements IProducer {
    public List<Consumer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Consumer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(Consumer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void clearObservers() {
        this.observers.removeAll(observers);
    }

    @Override
    public void broadcast() {
        for (Consumer observer : observers) {
            observer.consume("producer");
        }
    }

}
