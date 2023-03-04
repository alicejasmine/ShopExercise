package dk.easv.bll.orders;

import dk.easv.be.Order;

public class EmailManager {
    public void sendPaymentReceipt(Order order, String notificationEmail) {
        System.out.println("Sending payment receipt email to " + notificationEmail + " for order of product number " + order.getProductNumber());
    }
    public void sendOrderConfirmation(Order order, String notificationEmail) {
        System.out.println("Sending order confirmation email to " + notificationEmail + " for order of product number " + order.getProductNumber());
    }
}
