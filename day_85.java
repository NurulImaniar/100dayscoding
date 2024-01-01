package day_85;
import java.util.Scanner;
public class day_85 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suatu bilangan : ");
        int bilangan = input.nextInt();

        if (bilangan >= 0) {
            System.out.println("Bilangan cacah.");
        } else {
            System.out.println("Bilangan bukan cacah.");
        }

        input.close();
    }
}
