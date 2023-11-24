package Day_46;
import java.util.Scanner;
public class Day_46 {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        angka = input.nextInt();
        int hasil = angka;
        System.out.println(angka+"! =");
        for (int nilai = angka; nilai > 0; nilai--){
            System.out.print(nilai);
            if (nilai > 1){
                System.out.print(" x ");
            }
            if (angka != nilai){
                hasil *= nilai;
            }
        }
        System.out.println("");
        System.out.println("  = "+hasil);
        
    }
    
}