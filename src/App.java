import observerpattern.Producer;
import observerpattern.Interfaces.Consumer;
import observerpattern.Interfaces.IProducer;
import observerpattern.Models.*;

public class App {
    public static void main(String[] args) {
        Consumer subscriberOne = new SubscriberOne();
        Consumer subscriberTwo = new SubscriberTwo();
        Consumer subscriberThree = new SubscriberThree();

        IProducer producer = new Producer();
        producer.registerObserver(subscriberOne);
        producer.registerObserver(subscriberTwo);
        producer.registerObserver(subscriberThree);

        producer.broadcast();

    }
}
