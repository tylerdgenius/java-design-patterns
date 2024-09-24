// import observerpattern.Producer;
// import observerpattern.Interfaces.Consumer;
// import observerpattern.Interfaces.IProducer;
// import observerpattern.Models.*;

// import factorypattern.OsInitiate;
// import factorypattern.Interfaces.LoadOsInterface;

// import singletonpattern.Base;
// import singletonpattern.Interfaces.IBase;

import strategypattern.*;
import strategypattern.Interfaces.IShoppingCart;
import strategypattern.Models.*;

public class App {
    public static void main(String[] args) {

        // LoadOsInterface androidInitiate = new OsInitiate("ANDROID");

        // androidInitiate.load();

        // LoadOsInterface symbianInitiate = new OsInitiate("SYMBIAN");

        // symbianInitiate.load();

        // LoadOsInterface iosInitiate = new OsInitiate("IOS");

        // iosInitiate.load();

        // Consumer subscriberOne = new SubscriberOne();
        // Consumer subscriberTwo = new SubscriberTwo();
        // Consumer subscriberThree = new SubscriberThree();

        // IProducer producer = new Producer();
        // producer.registerObserver(subscriberOne);
        // producer.registerObserver(subscriberTwo);
        // producer.registerObserver(subscriberThree);

        // producer.broadcast();

        // Base base1 = Base.getBaseInstance();
        // Base base2 = Base.getBaseInstance();

        // System.out.println(base1 == base2);

        // Movie movie = new Movie();

        // movie.watchMovie();

        IShoppingCart paypalCart = new ShoppingCart(
                new PaypalPayment("user@email.com"));
        IShoppingCart creditCardPayment = new ShoppingCart(new CreditCardPayment(234));

        IShoppingCart cashCart = new ShoppingCart(new CashPayment());

        cashCart.checkout(200);
        paypalCart.checkout(500);
        creditCardPayment.checkout(400);
    }
}
