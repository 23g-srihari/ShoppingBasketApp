package receipt;

import model.Item;
import model.ShoppingBasket;

public class ReceiptFormatter {

    public String format(Receipt receipt) {
        StringBuilder output = new StringBuilder();
        ShoppingBasket basket = receipt.getBasket();

        for (Item item : basket.getItems()) {
            double itemTotal = item.getTotalPrice() + item.getTotalTax();
            output.append(String.format("%d %s: %.2f%n", item.getQuantity(), item.getName(), itemTotal));
        }

        output.append(String.format("Sales Taxes: %.2f%n", basket.getTotalTax()));
        output.append(String.format("Total: %.2f%n", receipt.getTotalPriceWithTax()));

        return output.toString();
    }
}
