package model;

import tax.TaxCalculator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotalTax() {
        return items.stream()
                .mapToDouble(TaxCalculator::calculateTax)
                .sum();
    }

    public double getTotalPriceWithTax() {
        return items.stream()
                .mapToDouble(item -> item.getBaseTotalPrice() + TaxCalculator.calculateTax(item))
                .sum();
    }
}
