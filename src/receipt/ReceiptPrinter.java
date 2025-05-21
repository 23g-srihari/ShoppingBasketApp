package receipt;

public class ReceiptPrinter {
    private final ReceiptFormatter formatter;

    public ReceiptPrinter(ReceiptFormatter formatter) {
        this.formatter = formatter;
    }

    public void print(Receipt receipt) {
        String output = formatter.format(receipt);
        System.out.println(output);
    }
}
