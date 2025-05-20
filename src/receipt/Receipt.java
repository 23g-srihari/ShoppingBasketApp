package receipt;

import model.Item;
import model.ShoppingBasket;

public class Receipt {
    private final ShoppingBasket basket;

    public Receipt(ShoppingBasket basket) {
        this.basket = basket;
    }

    public double getTotalPriceWithTax() {
        return basket.getTotalPrice() + basket.getTotalTax();
    }

    public String generateReceipt() {
        StringBuilder receiptDetails = new StringBuilder();

        for (Item item : basket.getItems()) {
            double itemTotalWithTax = item.getTotalPrice() + item.getTotalTax();
            receiptDetails.append(String.format("%d %s: %.2f\n",
                    item.getQuantity(), item.getName(), itemTotalWithTax));
        }

        double totalTax = basket.getTotalTax();
        double totalPrice = getTotalPriceWithTax();

        receiptDetails.append(String.format("Sales Taxes: %.2f\n", totalTax));
        receiptDetails.append(String.format("Total: %.2f\n", totalPrice));

        return receiptDetails.toString();
    }
}
