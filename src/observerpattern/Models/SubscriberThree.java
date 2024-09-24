package observerpattern.Models;

import observerpattern.Interfaces.*;

public class SubscriberThree implements Consumer {
    @Override
    public void consume(String consumeText) {
        System.out.println("I am subscriber 3 consuming from " + consumeText);
    }
}
