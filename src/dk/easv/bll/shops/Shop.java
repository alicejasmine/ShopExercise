package dk.easv.bll.shops;

import dk.easv.be.Country;

public abstract class Shop {
    public abstract void placeOrder(String productNumber, int quantity, double unitPrice, Country deliveryCountry, String notificationMail);
}
