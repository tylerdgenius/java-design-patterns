package strategypattern.Models;

import strategypattern.Interfaces.IPaymentStrategy;

public class PaypalPayment implements IPaymentStrategy {

    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Successfully paid " + amount + " with paypal email" + this.email);
    }
}
