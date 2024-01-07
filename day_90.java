package day_90;
import java.util.Scanner;
public class day_90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang array: ");
        int panjangArray = scanner.nextInt();
        
        double[] arr = new double[panjangArray];
            
        System.out.println("Masukkan index array (bilangan desimal):");
        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Index ke-" + (i + 1) + ": ");
            arr[i] = scanner.nextDouble();
        }

        // Input bilangan desimal yang dicari
        System.out.print("Masukkan bilangan desimal yang dicari: ");
        double bilanganDicari = scanner.nextDouble();

        // Panggil metode untuk mencari bilangan desimal
        boolean ditemukan = cekBilanganDesimal(arr, bilanganDicari);
        
        if (ditemukan) {
            System.out.println("Bilangan desimal " + bilanganDicari + " ditemukan dalam array.");
        } else {
            System.out.println("Bilangan desimal " + bilanganDicari + " tidak ditemukan dalam array.");
        }

        scanner.close();
    }
    // Metode untuk mencari bilangan desimal dalam array
    private static boolean cekBilanganDesimal(double[] array, double target) {
        for (double elemen : array) {
            if (elemen == target) {
                return true;
            }
        }
        return false;
    }
}
