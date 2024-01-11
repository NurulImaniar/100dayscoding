package day_94;
import java.util.Scanner;
public class day_94 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang dalam won (Korea): ");
        double won = masuk.nextDouble();

        // Nilai tukar 1 won ke Rupiah
        double NilaiTukar = 13.18; 

        // Menghitung nilai dalam Rupiah
        double Rupiah = won * NilaiTukar;

        System.out.println("Nilai dalam Rupiah: " + rupiah);
    }
}
