import input.InputParser;
import model.Item;
import model.ShoppingBasket;
import receipt.Receipt;
import receipt.ReceiptFormatter;
import receipt.ReceiptPrinter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ShoppingBasket basket = new ShoppingBasket();

            System.out.println("Enter items (type 'done' to finish):");

            while (true) {
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("done")) break;

                Item item = InputParser.parseItem(line);
                if (item != null) {
                    basket.addItem(item);
                }
            }

            Receipt receipt = new Receipt(basket);
            ReceiptFormatter formatter = new ReceiptFormatter();
            ReceiptPrinter printer = new ReceiptPrinter();

            String output = formatter.format(receipt);
            printer.print(output);
        }
    }
}
