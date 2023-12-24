package day_77;
import java.util.Scanner;
public class day_77 {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok : ");
        double gajiPokok = masuk.nextDouble();
        System.out.print("Masukkan tunjangan : ");
        double tunjangan = masuk.nextDouble();
        System.out.print("Masukkan potongan : ");
        double potongan = masuk.nextDouble();
        
        double[] gaji = {gajiPokok, tunjangan, potongan};
        double gajiBersih = hitungGajiBersih(gaji);
        
        System.out.println("Gaji Bersih : Rp." + gajiBersih);

        masuk.close();
    }

    // Fungsi untuk menghitung gaji bersih
    private static double hitungGajiBersih(double[] gaji) {
        double totalGaji = 0;
        for (double nilai : gaji) {
            totalGaji += nilai;
        }
        return totalGaji;
    }
}
