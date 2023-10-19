
package day_11;
import java.util.Scanner;
public class Day_11 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
       
        // Menghitung volume persegi panjang
        // volume = panjang*lebar*tinggi
        
        System.out.print("Panjang : ");
        int panjang = masuk.nextInt();
        
        System.out.print("Lebar : ");
        int lebar = masuk.nextInt();
        
        System.out.print("Tinggi : ");
        int tinggi = masuk.nextInt();
        
        int Volume = panjang * lebar * tinggi;
        System.out.println("Volume : " + Volume );
        
    }
    
}
