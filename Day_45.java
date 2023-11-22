package Day_45;
import java.util.Arrays;
import java.util.Scanner;
public class Day_45 {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah array : ");
        int JumlahArray = log.nextInt();
        int[] array = new int[JumlahArray];
        
        for (int i = 0; i < JumlahArray; i++) {
            System.out.print("Index ke-" + (i + 1) + ": ");
            array[i] = log.nextInt();
        }
        System.out.print("Masukkan angka :");
        int angka = log.nextInt();
        
        int max = Arrays.stream(array).max().orElse(0);
        int min = Arrays.stream(array).min().orElse(0);
        
        if (angka % 2 == 0) {
            // Jika genap, tambahkan angka terbesar
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = angka + max;
        } else {
            // Jika ganjil, tambahkan angka terkecil
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = angka + min;
        }

        // Menampilkan array setelah operasi
        System.out.println("Array setelah operasi: " + Arrays.toString(array));
    }
    
}