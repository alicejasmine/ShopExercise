package dk.easv.bll.shops;

import dk.easv.be.Country;
import dk.easv.be.Order;
import dk.easv.bll.ShopManagerFacade;
import dk.easv.bll.orders.EmailManager;
import dk.easv.bll.orders.PaymentManager;
import dk.easv.bll.orders.PriceManager;
import dk.easv.bll.orders.WarehouseManager;

public class LocalStore extends Shop {
    private ShopManagerFacade shopManagerFacade = ShopManagerFacade.getShopManagerFacade();

    @Override
    public void placeOrder(String productNumber, int quantity, double unitPrice, Country deliveryCountry, String notificationMail) {
        shopManagerFacade.placeOrder(productNumber, quantity, unitPrice, deliveryCountry, notificationMail);
    }

}
