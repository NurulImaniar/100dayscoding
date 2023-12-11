package day_11;
import java.util.Scanner;
public class day_64 {
    public static int pangkat (int a, int p){
        int hasil = a;
        for (int i = 1; i < p; i++) {
            hasil *= a;
        }
        return hasil;
    }
    public static void TampilPangkat(int a, int p){
        System.out.print(a + " Pangkat " + p + " = " );
        System.out.print(pangkat (a, p));
    }

    public static void main(String[] args) {
        int angka, pangkat;
        Scanner input = new Scanner (System.in);
        System.out.print("Angka : ");
        angka = input.nextInt();
        System.out.print("Pangkat : ");
        pangkat = input.nextInt();
        System.out.println("--------------------");
        TampilPangkat(angka,pangkat);
        System.out.println("");
    }

}
