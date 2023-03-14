package dk.easv.bll;

import dk.easv.be.Country;
import dk.easv.be.Order;
import dk.easv.bll.orders.EmailManager;
import dk.easv.bll.orders.PaymentManager;
import dk.easv.bll.orders.PriceManager;
import dk.easv.bll.orders.WarehouseManager;

public class ShopManagerFacade {


    //Singleton implementation
    private static ShopManagerFacade shopManagerFacade;

    //private constructor
    private ShopManagerFacade() {
    }

    //method to get instance
    public static ShopManagerFacade getShopManagerFacade() {
        if (shopManagerFacade == null)
            shopManagerFacade = new ShopManagerFacade();
        return shopManagerFacade;
    }

    private EmailManager emailManager = new EmailManager();
    private PaymentManager paymentManager = new PaymentManager();
    private WarehouseManager warehouseManager = new WarehouseManager();
    private PriceManager vatManager = new PriceManager();


    public void placeOrder(String productNumber, int quantity, double unitPrice, Country deliveryCountry, String notificationMail) {
        Order order = new Order(productNumber, quantity, unitPrice);
        emailManager.sendPaymentReceipt(order, notificationMail);
        paymentManager.withDrawFromCreditCard(order);
        vatManager.calculateVAT(order, deliveryCountry);
        vatManager.calculateTotalPrice(order);
        warehouseManager.orderFromWarehouse(order);
        emailManager.sendOrderConfirmation(order, notificationMail);
    }
}
