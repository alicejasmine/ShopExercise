package dk.easv;

import dk.easv.be.Country;
import dk.easv.bll.shops.LocalStore;
import dk.easv.bll.shops.Shop;

public class Main {

    public static void main(String[] args) {

        Shop shop = new LocalStore();
        shop.placeOrder("ABC123", 2, 10, new Country("Denmark", 25), "hbh@easv.dk");

    }
}
