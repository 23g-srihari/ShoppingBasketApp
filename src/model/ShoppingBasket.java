package model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private final List<Item> items = new ArrayList<>();
    private double totalTax = 0.0;

    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
            totalTax += item.getTotalTax();
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public double getTotalTax() {
        return totalTax;
    }
}
