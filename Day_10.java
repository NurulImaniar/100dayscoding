package day_10;
import java.util.Scanner;
public class Day_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan gaji Anda: ");
        double gaji = input.nextDouble();

        System.out.print("Masukkan pekerjaan Anda: ");
        String pekerjaan = input.next();

        double pajak = 0.05;
        double tunjangan = 0;

        if (pekerjaan.equalsIgnoreCase("PNS")) {
            pajak = 0.1;
        } else if (pekerjaan.equalsIgnoreCase("buruh")) {
            tunjangan = 0.1;
        }

        double gajiBersih = gaji - (gaji * pajak) + (gaji * tunjangan);

        System.out.println("\nNama: " + nama);
        System.out.println("Gaji: " + gaji);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Gaji Bersih: " + gajiBersih);
  
        
        
        
        
        
        
            
    }
    
}
