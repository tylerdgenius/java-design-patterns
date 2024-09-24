package observerpattern.Interfaces;

import java.util.List;

public interface IProducer {
    void registerObserver(Consumer observer);

    void unregisterObserver(Consumer observer);

    void clearObservers(List<Consumer> observer);

    void broadcast();
}
