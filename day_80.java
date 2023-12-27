package day_80;
import java.util.Scanner;
public class day_80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas atas: ");
        int batasAtas = sc.nextInt();

        int i = 1;
        int ganjil = 0;
        int genap = 0;

        while (i <= batasAtas) {
            if (i % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }
            i++;
        }

        System.out.println("Jumlah bilangan genap: " + genap);
        System.out.println("Jumlah bilangan ganjil: " + ganjil);
    }
}
