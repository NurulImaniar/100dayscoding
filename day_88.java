package day_88;
import java.util.Scanner;
public class day_88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] gajiPokok = {2500000, 3000000, 3500000, 4000000, 4500000};
        // Input pangkat TNI
        System.out.print("Masukkan pangkat TNI (1-5): ");
        int pangkat = scanner.nextInt();

        // Validasi input pangkat
        if (pangkat < 1 || pangkat > 5) {
            System.out.println("Pangkat TNI tidak valid.");
        } else {
            
            int gaji = gajiPokok[pangkat - 1];
            System.out.println("Gaji pokok TNI untuk pangkat " + pangkat + " adalah: " + gaji);
        }

        scanner.close();
    }
}
