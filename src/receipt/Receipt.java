package receipt;

import model.Item;
import model.ShoppingBasket;

import java.util.List;

public class Receipt {
    private final ShoppingBasket basket;

    public Receipt(ShoppingBasket basket) {
        this.basket = basket;
    }

    public List<Item> getItems() {
        return basket.getItems();
    }

    public double getTotalTax() {
        return basket.getTotalTax();
    }

    public double getTotalPriceWithTax() {
        return basket.getTotalPrice() + basket.getTotalTax();
    }
}
