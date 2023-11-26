public class Bayar extends Pelanggan { // inheritance
    private String noFaktur;
    public Bayar(String namaPelanggan, String belajaan, int totalBayar, int saldo,  String noFaktur) {
        super(namaPelanggan, belajaan, totalBayar, saldo);
        this.noFaktur=noFaktur;
    }

    public String getNoFaktur() {
        return noFaktur;
    }

    public void pembayaranCheck() { //polymorphysme
        System.out.println("Jumlah pembayaran");
        System.out.println("Atas nama" + getNamaPelanggan());
        System.out.println("Belajaan: " + getBelajaan());
        System.out.println("Total pembayaran=  " + hitungTotalPembayaran(totalBayar));
        System.out.println("Saldo: " + getSaldo());
        System.out.println("No Faktur:  " + getNoFaktur());
    }
}
