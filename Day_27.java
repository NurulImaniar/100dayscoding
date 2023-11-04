package day_11;
public class Day_27 {
    public static void main(String[] args) {
        long  Jumlah_Kapling = 30;
        long HargaPermeter = 500_000;
        long UkuranLahan = 10*15;
        
        double Jumlah = (UkuranLahan*Jumlah_Kapling)*HargaPermeter;
        System.out.println("Harga keseluruhan : " + Jumlah);
    }
    
}
