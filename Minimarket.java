public class Minimarket {
    public String namaPelanggan;
    public String belanjaan;
    public int totalBayar;

    public Minimarket (String namaPelanggan, String belajaan, int totalBayar) {
        this.namaPelanggan=namaPelanggan;
        this.belanjaan=belajaan;
        this.totalBayar=totalBayar;
    }
    
    public void pembayaranCheck() { //polymorphisme
        System.out.println("Pembayaran" +this.namaPelanggan + "dengan belanjaan" +this.belanjaan);
    }

    public String toString() {
        return namaPelanggan + "" + belanjaan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getBelajaan() {
        return belanjaan;
    }
    

}
