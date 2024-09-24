package strategypattern.Models;

import strategypattern.Interfaces.IPaymentStrategy;

public class CashPayment implements IPaymentStrategy {
    public CashPayment() {
        //
    }

    @Override
    public void pay(int amount) {
        System.out.println("Successfully paid " + amount + " cash");
    }
}