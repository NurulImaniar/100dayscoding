package day_11;
import java.util.Scanner;
public class Day_26 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int awal,akhir;
        System.out.println("Bilangan genap");
        System.out.print("Awal : ");
        awal = input.nextInt();
        System.out.print("Akhir : ");
        akhir = input.nextInt();
        
        int nilai = awal;
        while(nilai <= akhir){
            int hasil = nilai % 2;
            if (hasil == 0){ //Jika ingin mencari bilangan ganjil 0 di ganti menjadi 1
                System.out.print(nilai + " ");
            }
            nilai++;
        }
        System.out.println("");
        
       
    }
}
