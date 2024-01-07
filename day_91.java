package day_91;
import java.util.Scanner;
public class day_91 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjangArray = scanner.nextInt();
        
        int[] arrayBilangan = new int[panjangArray];
        
        System.out.println("Masukkan index array:");
        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Index ke-" + (i + 1) + ": ");
            arrayBilangan[i] = scanner.nextInt();
        }

        System.out.println("Bilangan prima dalam array:");
        for (int bilangan : arrayBilangan) {
            if (isPrima(bilangan)) {
                System.out.print(bilangan + " ");
            }
        }

        scanner.close();
    }

    // Fungsi untuk mengecek apakah suatu bilangan prima atau bukan
    private static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
