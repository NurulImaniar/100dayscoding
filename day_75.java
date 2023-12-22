package day_75;
import java.util.Scanner;
public class day_75 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah nama: ");
        int jumlahNama = input.nextInt();
        input.nextLine();

        String[] namaArray = new String[jumlahNama];
        System.out.println("Masukkan nama-nama:");
        for (int i = 0; i < jumlahNama; i++) {
            System.out.print("Nama ke-" + (i + 1) + ": ");
            String nama = input.nextLine();

            if (nama.length() > 4) {
                namaArray[i] = nama;
            } else {
                System.out.println("Nama harus memiliki lebih dari 4 karakter. Silakan masukkan lagi.");
                i--; 
            }
        }

        System.out.println("\nNama-nama dengan lebih dari 4 karakter:");

        for (String nama : namaArray) {
            if (nama != null) {
                System.out.println(nama);
            }
        }

        input.close();
    }
}
