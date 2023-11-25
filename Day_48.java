package Day_48;
import java.util.Scanner;
public class Day_48 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int f1 = 0;
        int f2 = 1;
        System.out.print("Jumlah angka : ");
        int n = masuk.nextInt();
        
        int fn;
        System.out.println("Deret fibonacci  ");
        // Deret bilangan yang mana bilangan saat ini
        // adalah penjumlahan dari 2 bilangan sebelumnya.
        System.out.print(f1+" , ");
        System.out.print(f2);
        for (int angka = 0; angka < n; angka++){
            fn = f2 + f1;
            System.out.print(" , "+fn);
            f1 = f2;
            f2 = fn;
        }
    }
}