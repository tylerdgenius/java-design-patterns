package observerpattern.Models;

import observerpattern.Interfaces.*;

public class SubscriberTwo implements Consumer {
    @Override
    public void consume(String consumeText) {
        System.out.println("I am subscriber 2 consuming from " + consumeText);
    }
}
