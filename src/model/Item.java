package model;

public class Item {
    private final String name;
    private final double price;
    private final int quantity;
    private final boolean isImported;
    private final boolean isExempt;

    public Item(String name, double price, int quantity, boolean isImported, boolean isExempt) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isImported = isImported;
        this.isExempt = isExempt;
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

    public double getBaseTotalPrice() {
        return price * quantity;
    }

    public String getDisplayName() {
        return name;
    }
}
