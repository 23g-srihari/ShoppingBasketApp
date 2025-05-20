package receipt;

import model.Item;

public class ReceiptFormatter {

    // Formats the receipt as plain text
    public String format(Receipt receipt) {
        StringBuilder sb = new StringBuilder();

        for (Item item : receipt.getItems()) {
            sb.append(String.format("%d %s: %.2f\n",
                    item.getQuantity(),
                    item.getName(),
                    item.getTotalPriceWithTax()));
        }

        sb.append(String.format("Sales Taxes: %.2f\n", receipt.getTotalTax()));
        sb.append(String.format("Total: %.2f\n", receipt.getTotalPriceWithTax()));

        return sb.toString();
    }
}
