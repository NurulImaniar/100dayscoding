package day_72;
import java.util.Scanner;
public class day_72 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai raport : ");
        int nilai = scanner.nextInt();

        // Menentukan grade berdasarkan rentang nilai
        if (nilai >= 90 && nilai <= 100) {
            System.out.println("A");
        } else if (nilai >= 80 && nilai < 90) {
            System.out.println(" B");
        } else {
            System.out.println("Nilai diluar rentang yang dijelaskan");
        }

        scanner.close();
    }
}
