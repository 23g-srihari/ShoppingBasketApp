package model;

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

    public double getTotalPrice() {
        return items.stream().mapToDouble(Item::getTotalPrice).sum();
    }

    public double getTotalTax() {
        return items.stream().mapToDouble(Item::getTotalTax).sum();
    }
}
