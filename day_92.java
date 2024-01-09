package day_92;
import java.util.Scanner;
public class day_92 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris: ");
        int rows = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int columns = input.nextInt();
        System.out.print("Masukkan jumlah kedalaman: ");
        int depth = input.nextInt();
        
        int[][][] array3D = new int[rows][columns][depth];

        // Input elemen array 3D
        System.out.println("Masukkan index array 3D:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < depth; k++) {
                    System.out.print("Masukkan index untuk indeks [" + i + "][" + j + "][" + k + "]: ");
                    array3D[i][j][k] = input.nextInt();
                }
            }
        }

        // Cari dan tampilkan bilangan ganjil
        System.out.println("Bilangan ganjil dalam array 3D:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < depth; k++) {
                    if (array3D[i][j][k] % 2 != 0) {
                        System.out.println("[" + i + "][" + j + "][" + k + "]: " + array3D[i][j][k]);
                    }
                }
            }
        }

        input.close();
    }
}
