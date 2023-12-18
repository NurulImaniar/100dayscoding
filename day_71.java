package day_11;
import java.util.Scanner;
public class day_71 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jumlah;
        double nilai,total = 0, rerata;
        System.out.print("Berapa nilai : ");
        jumlah = input.nextInt();
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Nilai ke-"+ i+ " = ");
            nilai = input.nextInt();
            total += nilai;
        }
        rerata = total / jumlah;
        System.out.println("Total = " +total);
        System.out.println("Rerata = " +rerata);
    }
    
}
