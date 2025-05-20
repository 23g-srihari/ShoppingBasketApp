package tax;

import model.Item;

public class TaxCalculator {

    public static double calculateTax(Item item) {
        double tax = 0.0;

        if (!item.isExempt()) {
            tax += item.getPrice() * TaxRate.BASIC_SALES_TAX;
        }

        if (item.isImported()) {
            tax += item.getPrice() * TaxRate.IMPORT_DUTY;
        }

        tax *= item.getQuantity();
        return roundToTwoDecimalPlaces(tax);
    }

    private static double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
