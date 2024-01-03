package day_86;
import java.util.Scanner;
public class daya_86 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan sebuah bilangan: ");
            int input = masuk.nextInt();

            if (input % 2 == 0) {
                System.out.println("Bilangan genap");
            } else {
                System.out.println("You and I, end");
                break;
            }
        }
        masuk.close();
    }
}
