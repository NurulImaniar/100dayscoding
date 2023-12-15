package day_68;
import java.util.Scanner;
public class day_68 {
    public static double HrgaDiskon (double harga, double diskon){
        double x = harga * (diskon / 100);
        double hasil = harga - x;
        return hasil;
    }
        public static void TotalDiskon (double harga, double diskon){
            System.out.println("Harga barang : Rp."+ harga);
            System.out.println("Diskon       :"+diskon +"%");
            System.out.println("------------------------");
            System.out.println("Total : "+HrgaDiskon(harga,diskon));
        }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double harga,diskon,x;
        System.out.print("Input harga : Rp.");
        harga = input.nextDouble();
        if (harga > 500_000){
            diskon = 15;
        }else if (harga > 100_000){
            diskon = 10;
        }else {
            diskon = 0;
        }
        System.out.println("---------------------");
        TotalDiskon(harga,diskon);
    }
    
}