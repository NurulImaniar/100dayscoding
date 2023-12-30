package day_83;
import java.util.Scanner;
public class day_83 {
    public static void main(String[] args) {
        String[][] Huruf= new String[3][3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan huruf untuk baris " + (i + 1) + " kolom " + (j + 1) + ": ");
                Huruf[i][j] = input.next();
            }
        }
        System.out.println("\nIsi Array 2D:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Huruf[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
