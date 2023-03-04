package dk.easv.bll.orders;

import dk.easv.be.Order;

public class WarehouseManager {
    public void orderFromWarehouse(Order order) {
        System.out.println("Placed order for " + order.getQuantity() + " item(s) of product " + order.getProductNumber() + " in warehouse.");
    }
}
