package day_89;
import java.util.Scanner;
public class day_89 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        // Deklarasi array untuk menyimpan informasi gaji polisi
        int[] gaji = new int[3];  // Gaji[0] = gaji pokok, Gaji[1] = tunjangan, Gaji[2] = potongan
        
        System.out.print("Masukkan gaji pokok polisi: ");
        gaji[0] = masuk.nextInt();

        
        System.out.print("Masukkan tunjangan polisi: ");
        gaji[1] = masuk.nextInt();
        
        System.out.print("Masukkan potongan gaji polisi: ");
        gaji[2] = masuk.nextInt();
        
        int gajiBersih = gaji[0] + gaji[1] - gaji[2];
        
        System.out.println("Gaji bersih polisi per bulan: " + gajiBersih);

        masuk.close();
    }
}
