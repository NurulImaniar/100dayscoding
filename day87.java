package day_87;
import java.util.Scanner;
public class day87 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int HargaKomputer = 55_000_000;
        int BiayaKos = 750_000;
        int BatasTabunganBulanan = 1_500_000;
        
        // Penghitungan jumlah bulan yang dibutuhkan
        int totalTabungan = 0;
        while (totalTabungan < HargaKomputer) {
            totalTabungan += BatasTabunganBulanan;
            totalTabungan -= BiayaKos;

            // Jika total tabungan negatif, berarti Dilan tidak dapat mencapai target
            if (totalTabungan < 0) {
                System.out.println("Dilan tidak dapat membeli komputer Sultan.");
                break;
            }
            totalTabungan++;
        }
        if (totalTabungan >= HargaKomputer) {
            System.out.println("Dilan membutuhkan minimal " + totalTabungan + " bulan untuk membeli komputer Sultan.");
        }
        scanner.close();
    }
}
