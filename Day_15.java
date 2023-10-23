package day_11;
import java.util.Scanner;
public class Day_15 {
    public static void main(String[] args) {
        
        // if else bersarang
        
        Scanner input = new Scanner (System.in);
        int pilih, porsi;
        String menu = null;
        double harga = 0, diskon = 0;
        System.out.println("----Salad buah----");
        System.out.println("1. Lokal\n2. Luar negeri");
        System.out.print("Pilih\t : ");
        pilih = input.nextInt();
        System.out.print("Porsi\t : ");
        porsi = input.nextInt();
        
        if (pilih == 1){
            menu = "Buah lokal";
            harga = 10000;
        } else if (pilih == 2){
            menu = "Buah luar negeri";
            harga = 15000;
            if (porsi >= 10){
                diskon = 10 * (harga*porsi)/100;
                System.out.println("Diskon 10% - Rp."+ diskon);
            }else{
                System.out.println("Diskon 10% minimal 10 porsi");
            }
                    
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Menu terpilih : ");
        System.out.println(menu+" - Rp." +harga+ "/porsi");
        harga = (harga * porsi)- diskon;
        System.out.println("Total \t: Rp. "+harga);
        
    }
    
}
