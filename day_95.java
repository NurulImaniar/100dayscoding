package day_95;
import java.util.Scanner;
public class day_95 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan nilai dalam dollar: ");
        double NilaiDollar = masuk.nextDouble();
        
        double NilaiTukar = 15000;

        // Hitung nilai dalam rupiah
        double nilaiRupiah = NilaiDollar * NilaiTukar;

        
        System.out.println("Nilai dalam Rupiah: " + nilaiRupiah);

        masuk.close();
    }
}
