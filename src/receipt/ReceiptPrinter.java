package receipt;

public class ReceiptPrinter {
    private final ReceiptFormatter formatter = new ReceiptFormatter();

    public void print(Receipt receipt) {
        System.out.println(formatter.format(receipt));
    }
}
