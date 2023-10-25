package day_11;
import java.util.Scanner;
public class Day_17 {
    public static void main(String[] args) {
         Scanner nilai = new Scanner (System.in);
        int awal,akhir;
         System.out.println("jangkauan angka");
         System.out.println("~~~~~~~~~~~~~~~~~~");
         System.out.print("Awal : ");
         awal = nilai.nextInt();
         System.out.print("Akhir : ");
         akhir = nilai.nextInt();
         for (int b = awal; b <= akhir; b++) {
             System.out.print(b+" ");
        }
         System.out.println("");
    }
         
         
    }

