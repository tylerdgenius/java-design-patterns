package observerpattern.Interfaces;

import java.util.List;

public interface Producer {
    void registerObserver(Consumer observer);

    void unregisterObserver(Consumer observer);

    void clearObservers(List<Consumer> observer);

    void broadcast();
}
