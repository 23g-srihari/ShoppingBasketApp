package receipt;

import model.Item;
import model.ShoppingBasket;
import tax.TaxCalculator;

public class Receipt {
    private final ShoppingBasket basket;

    public Receipt(ShoppingBasket basket) {
        this.basket = basket;
    }

    public String getLineForItem(Item item) {
        double tax = TaxCalculator.calculateTax(item);
        double totalPrice = item.getBaseTotalPrice() + tax;
        return String.format("%d %s: %.2f", item.getQuantity(), item.getDisplayName(), totalPrice);
    }

    public ShoppingBasket getBasket() {
        return basket;
    }

    public double getTotalTax() {
        return basket.getTotalTax();
    }

    public double getTotalPriceWithTax() {
        return basket.getTotalPriceWithTax();
    }
}
