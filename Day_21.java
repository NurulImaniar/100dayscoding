package day_11;
public class Day_21 {
    public static void main(String[] args) {
        int hargamobil = 150000000;
        int gajiBulanan = 6000000;
        int kebutuhanBulanan = 3000000;
        int kebutuhanOrtu = 1000000;
        int tabungan = gajiBulanan - (kebutuhanBulanan + kebutuhanOrtu);
       
        int totaltabungan = 0;
        int bulan = 0;
        
        while(totaltabungan < hargamobil){
            totaltabungan += tabungan;
            bulan++;
            
        }
        int tahun = bulan / 12;
        int sisa = bulan % 12;
        
        System.out.println("Inas butuh waktu "+tahun+" tahun "+sisa+ " bulan untuk membeli mobil seharga 150.000.000 juta");
       
        }
    }
    
