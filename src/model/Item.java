package model;

public class Item {
    private final String name;
    private final double price;
    private final int quantity;
    private final boolean isImported;
    private final boolean isExempt;
    private final double totalTax;

    public Item(String name, double price, int quantity, boolean isImported, boolean isExempt) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isImported = isImported;
        this.isExempt = isExempt;
        this.totalTax = calculateTax();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isImported() {
        return isImported;
    }

    public boolean isExempt() {
        return isExempt;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public double getTotalPriceWithTax() {
        return getTotalPrice() + totalTax;
    }

    private double calculateTax() {
        double tax = 0.0;

        if (!isExempt) {
            tax += price * 0.10;
        }
        if (isImported) {
            tax += price * 0.05;
        }

        tax *= quantity;
        return roundToTwoDecimalPlaces(tax);
    }

    private double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
