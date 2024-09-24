import observerpattern.Main;
import observerpattern.Interfaces.Consumer;
import observerpattern.Models.SubscriberOne;
import observerpattern.Models.SubscriberTwo;

public class App {
    public static void main(String[] args) {
        Consumer subscriberOne = new SubscriberOne();
        Consumer subscriberTwo = new SubscriberTwo();

        Main producer = new Main();
        producer.registerObserver(subscriberOne);
        producer.registerObserver(subscriberTwo);

        producer.broadcast();

    }
}
