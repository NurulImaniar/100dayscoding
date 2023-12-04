package day_11;
import java.util.Scanner;
public class Day_53{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Masukkan indeks baris:");
        int indeksBaris = scanner.nextInt();

        System.out.println("Masukkan indeks kolom:");
        int indeksKolom = scanner.nextInt();

        // Melakukan percabangan menggunakan switch case
        switch (array2D[indeksBaris][indeksKolom]) {
            case 1:
                System.out.println("Anda memilih elemen dengan nilai 1");
                break;
            case 2:
                System.out.println("Anda memilih elemen dengan nilai 2");
                break;
            case 3:
                System.out.println("Anda memilih elemen dengan nilai 3");
                break;
            case 4:
                System.out.println("Anda memilih elemen dengan nilai 4");
                break;
            case 5:
                System.out.println("Anda memilih elemen dengan nilai 5");
                break;
            case 6:
                System.out.println("Anda memilih elemen dengan nilai 6");
                break;
            case 7:
                System.out.println("Anda memilih elemen dengan nilai 7");
                break;
            case 8:
                System.out.println("Anda memilih elemen dengan nilai 8");
                break;
            case 9:
                System.out.println("Anda memilih elemen dengan nilai 9");
                break;
            default:
                System.out.println("Indeks tidak valid");
        }
    }
}
