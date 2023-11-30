package day_11;
import java.util.Scanner;

public class Day_51{
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input ukuran array 3D
        System.out.print("Masukkan jumlah dimensi : ");
        int dimensi1 = scanner.nextInt();
        System.out.print("Masukkan jumlah dimensi kedua: ");
        int dimensi2 = scanner.nextInt();
        System.out.print("Masukkan jumlah dimensi ketiga: ");
        int dimensi3 = scanner.nextInt();

        // Membuat array 3D
        int[][][] array3D = new int[dimensi1][dimensi2][dimensi3];

        // Input elemen array 3D
        System.out.println("Masukkan elemen array 3D:");

        for (int i = 0; i < dimensi1; i++) {
            for (int j = 0; j < dimensi2; j++) {
                for (int k = 0; k < dimensi3; k++) {
                    System.out.print("Elemen [" + i + "][" + j + "][" + k + "]: ");
                    array3D[i][j][k] = scanner.nextInt();
                }
            }
        }

        // Menampilkan elemen array 3D
        System.out.println("Elemen array 3D:");

        for (int i = 0; i < dimensi1; i++) {
            for (int j = 0; j < dimensi2; j++) {
                for (int k = 0; k < dimensi3; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();
    }
}
