package receipt;

import model.Item;

public class ReceiptFormatter {

    public String format(Receipt receipt) {
        StringBuilder sb = new StringBuilder();

        for (Item item : receipt.getBasket().getItems()) {
            sb.append(receipt.getLineForItem(item)).append("\n");
        }

        sb.append(String.format("Sales Taxes: %.2f%n", receipt.getTotalTax()));
        sb.append(String.format("Total: %.2f%n", receipt.getTotalPriceWithTax()));

        return sb.toString();
    }
}
