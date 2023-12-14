package day_67;

public class day_67 {
    public static double HrgaDiskon (double harga, double diskon){
        double x = harga * (diskon / 100);
        double hasil = harga - x;
        return hasil;
    }
        public static void TotalDiskon (double harga, double diskon){
            System.out.println("Harga barang : Rp."+ harga);
            System.out.println("Diskon       :"+diskon +"%");
            System.out.println("------------------------");
            System.out.println("Total : "+HrgaDiskon(harga,diskon));
        }
    public static void main(String[] args) {
        double harga,diskon,x;
        harga = 500000;
        diskon = 10;
        TotalDiskon(harga,diskon);
    }
    
}