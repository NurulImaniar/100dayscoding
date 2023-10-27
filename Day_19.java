package day_11;
import java.util.Scanner;
public class Day_19 {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         String nama,hobi,saya;
         do{
         System.out.print("Nama : ");
         nama = input.nextLine();
         System.out.print("suka : ");
         hobi = input.nextLine();
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println(nama+ " suka bermain " +hobi);
             System.out.print("Ulang (a/b): ");
             saya = input.nextLine();
             
        
         }while(saya.equals("a"));
         System.out.println("Selesai");
        
    
         
    }
}
