package day_11;
import java.util.Scanner;
public class Day_14 {
     public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         
         System.out.print("Masukkan nilai : ");
         int nilai = input.nextInt();
        
         if (nilai % 2 == 0){
             System.out.println(nilai + " adalah bilangan genap");
             
         } else {
             System.out.println(nilai + " adalah bilangan ganjil");
         }
         
     }
    
}
