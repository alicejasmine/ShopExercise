package dk.easv.bll.orders;

import dk.easv.be.Country;
import dk.easv.be.Order;

public class PriceManager {
    public void calculateVAT(Order order, Country deliveryCountry) {
        order.setVAT(order.getTotalPrice() * (deliveryCountry.getVATRate() / 100));
        System.out.println("Calculated VAT to be " + order.getVAT() + " when sending to " + deliveryCountry.getName());
    }

    public void calculateTotalPrice(Order order) {
        order.setTotalPrice(order.getQuantity() * order.getUnitPrice());
        System.out.println("Calculated total price of " + order.getQuantity() + " item(s) of " + order.getProductNumber() + " to be " + order.getTotalPrice());
    }
}
