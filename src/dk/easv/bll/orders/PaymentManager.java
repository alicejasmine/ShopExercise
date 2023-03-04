package dk.easv.bll.orders;

import dk.easv.be.Order;

public class PaymentManager {
    public void withDrawFromCreditCard(Order order) {
        System.out.println("Withdrawing " + (order.getTotalPrice() + order.getVAT()) + " from credit card to pay for product number " + order.getProductNumber());
    }
}
