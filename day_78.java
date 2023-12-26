package day_78;
import java.util.Scanner;
public class day_78 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang array: ");
        int panjangArray = input.nextInt();
        int[] arrayAngka = new int[panjangArray];
        
        System.out.println("Masukkan index array:");
        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Index ke-" + (i + 1) + ": ");
            arrayAngka[i] = input.nextInt();
        }
        
        hitungGanjilGenap(arrayAngka);
    }
    private static void hitungGanjilGenap(int[] array) {
        int jumlahGanjil = 0;
        int jumlahGenap = 0;

        
        for (int angka : array) {
            if (angka % 2 == 0) {
                // Jika angka genap
                jumlahGenap++;
            } else {
                // Jika angka ganjil
                jumlahGanjil++;
            }
        }
        
        System.out.println("Jumlah bilangan genap: " + jumlahGenap);
        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
    }
}
