package strategypattern.Models;

import strategypattern.Interfaces.IPaymentStrategy;

public class CreditCardPayment implements IPaymentStrategy {
    private int cardNumber;

    public CreditCardPayment(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Successfully paid" + amount + "with card number" + this.cardNumber);
    }
}
