package observerpattern.Models;

import observerpattern.Interfaces.Consumer;

public class SubscriberOne implements Consumer {
    @Override
    public void consume(String consumeText) {
        System.out.println("I am subscriber 1 consuming from " + consumeText);
    }
}
