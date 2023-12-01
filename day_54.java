package Day_54;
import java.util.Scanner;
public class day_54 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris : ");
        int baris1 = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int baris2 = scanner.nextInt();
        // Membuat array 2D untuk menyimpan nama buah
        String[][] buah = new String[baris1][baris2];
        // Input nama buah dari user
        for (int c = 0; c < baris1; c++) {
            for (int d = 0; d < baris2; d++) {
                System.out.print("Masukkan nama buah untuk baris(" + (c + 1) + " kolom " + (d + 1) + ": ");
                buah[c][d] = scanner.next();
            }
        }
        // Menampilkan array 2D
        System.out.println("\nArray 2D Buah : ");
        for (int c = 0; c < baris1; c++) {
            for (int d = 0; d < baris2; d++) {
                System.out.print(buah[c][d] + "\t");
            }
        }
        scanner.close();
    }
}
