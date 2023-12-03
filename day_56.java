package day_56;
import java.util.Scanner;
public class day_56 {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        // Ukuran array 2D
        int baris = 2;
        int kolom = 2;

        // Deklarasi array 2D
        String[][] array2D = new String[baris][kolom];

        int i = 0;
        int j = 0;
        
        do {
            do {
                System.out.print("Masukkan buah untuk baris " + i + " kolom " + j + ": ");
                array2D[i][j] = masuk.next();
                j++;
            } while (j < kolom);

            j = 0;
            i++;
        } while (i < baris);

        // Menampilkan isi array 2D
        System.out.println("\nIsi array 2D:");
        for (i = 0; i < baris; i++) {
            for (j = 0; j < kolom; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }

        masuk.close();
    }
}
