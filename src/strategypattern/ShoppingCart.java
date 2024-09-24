package strategypattern;

import strategypattern.Interfaces.IPaymentStrategy;
import strategypattern.Interfaces.IShoppingCart;

public class ShoppingCart implements IShoppingCart {
    private IPaymentStrategy paymentStrategy;

    public ShoppingCart(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy is not set");
            return;
        }

        paymentStrategy.pay(amount);
    }
}
