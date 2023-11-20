package day_11;
import java.util.Scanner;
public class Day_43 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int pilih,harga = 0,porsi;
        System.out.println("Pilihan menu : ");
        System.out.println("1.Mie ayam\n2.Bakso\n3.Nasi goreng");
        System.out.print("Pilih : ");
        pilih = masuk.nextInt();
        System.out.print("Porsi : ");
        porsi = masuk.nextInt();
        switch (pilih) {
            case 1 :
                System.out.println("Mie ayam (10k/porsi) ");
                harga = 10_000 * porsi;
                break;
            case 2 :
                System.out.println("Bakso (12k/porsi)");
                harga = 12_000 * porsi;
                break;
            case 3 :
                System.out.println("Nasi goreng (15k/porsi)");
                harga = 15_000 * porsi;
                break;
            default :
                System.out.println("Pilihan tidak ada !");
                break;
        }
        System.out.println("Total : "+harga);
            
       
    }
    
}
