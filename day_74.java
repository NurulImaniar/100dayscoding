package day_74;
import java.util.Scanner;
public class day_74 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan batas atas : ");
        int batasAtas = masuk.nextInt();

        int total = 0;
        for (int i = 1; i <= batasAtas; i++) {
            total += i;
        }

        System.out.println("Total penjumlahan : " + total);
    }
}
