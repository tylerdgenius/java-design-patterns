package observerpattern.Models;

import observerpattern.Interfaces.*;

public class SubscriberOne implements Consumer {
    @Override
    public void consume(String consumeText) {
        System.out.println("I am subscriber 3 consuming from " + consumeText);
    }
}
