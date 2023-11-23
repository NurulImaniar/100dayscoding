package day_11;
import java.util.Scanner;
public class Day_46 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        int bilangan,pangkat,hasil;
        System.out.print("Masukkan bilangan : ");
        bilangan = masuk.nextInt();
        System.out.print("Masukkan pangkat : ");
        pangkat = masuk.nextInt();
        System.out.println("-------------------");
        System.out.print("Hasil : ");
        hasil = bilangan;
        
        for (int angka = 1; angka < pangkat; angka++) {
            hasil *= bilangan;
        }
        System.out.println(hasil);
    }
    
}
