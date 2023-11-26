public class Driverclass {

    public static void main(String[]args){
        Bayar r = new Bayar("ruchil", "sabun cuci baju ", 20000, 50000, "acds123");
        Minimarket s = new Bayar("inul", "kopi", 17000, 20000, "acds345");
        System.out.println("Pembayaran diambil dari bukti pembayaran");
        r.pembayaranCheck();
        System.out.println("Pembayaran diambil dari minimarket");
        s.pembayaranCheck();
    }
}
