package day_11;
import java.util.Scanner;
public class Day_18 {
    public static void main(String[] args) {
        Scanner angka = new Scanner (System.in);
        int awal,akhir;
        System.out.println("Bilangan ganjil");
        System.out.print("Awal : ");
        awal = angka.nextInt();
        System.out.print("Akhir : ");
        akhir = angka.nextInt();
        
        int nilai = awal;
        while(nilai <= akhir){
            int hasil = nilai % 2;
            if (hasil == 1){ //Jika ingin mencari bilangan genap 1 di ganti menjadi 0
                System.out.print(nilai + " ");
            }
            nilai++;
        }
        System.out.println("");
        
       
        
    }
}
