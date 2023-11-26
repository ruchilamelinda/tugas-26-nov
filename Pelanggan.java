public class Pelanggan extends Minimarket implements Diskon { //inheritance dan interface
    private int saldo;
    public Pelanggan(String namaPelanggan, String belajaan, int totalBayar, int saldo) {
        super(namaPelanggan, belajaan, totalBayar);
        getSaldo();
    }

    public int hitungTotalPembayaran(int totalBayar){
    if (totalBayar >= 100000 && totalBayar <= 250000){
        totalBayar = totalBayar - totalBayar * 1/100;
        this.totalBayar = totalBayar;
   }
   if (totalBayar > 250000 && totalBayar <= 500000){
    totalBayar = totalBayar - totalBayar * 3/100;
    this.totalBayar = totalBayar;
   }

   else if (totalBayar > 500000) {
    totalBayar = totalBayar - totalBayar * 5/100;
    this.totalBayar = totalBayar;
   }

   this.totalBayar = totalBayar;
   return this.totalBayar;
   } 
   
   public int getSaldo() {
    this.saldo = saldo;
    return saldo;
   
   }
   
}
