package input;

import model.Item;

public class InputParser {
    public static Item parseItem(String line) {
        try {
            String[] parts = line.split(" at ");
            double price = Double.parseDouble(parts[1]);

            String[] quantityAndName = parts[0].split(" ", 2);
            int quantity = Integer.parseInt(quantityAndName[0]);
            String name = quantityAndName[1];

            boolean isImported = name.toLowerCase().contains("imported");
            boolean isExempt = name.toLowerCase().contains("book") ||
                               name.toLowerCase().contains("chocolate") ||
                               name.toLowerCase().contains("pill");

            return new Item(name, price, quantity, isImported, isExempt);
        } catch (Exception e) {
            System.out.println("Invalid input format. Please use '1 book at 12.49'");
            return null;
        }
    }
}
