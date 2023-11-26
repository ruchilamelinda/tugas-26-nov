import javax.management.openmbean.InvalidKeyException;

public class Exception {
    public static void main(String[] args) {
        try {
            System.out.print("Masukkan no faktur: ");
            String invoiceNumber = new java.util.Scanner(System.in).nextLine();
            validateInvoiceNumber(invoiceNumber);
        } 
        catch (final InvalidKeyException e) {
            System.out.println("Error: " + e.getMessage());
    
}

    }

    private static void validateInvoiceNumber(String invoiceNumber) {
    }
}
