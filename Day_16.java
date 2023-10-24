
package day_11;
import java.util.Scanner;
public class Day_16 {
    public static void main(String[] args) {
        Scanner ruang = new Scanner (System.in);
        System.out.println("Menghitung volume bangun ruang");
        System.out.println("================================");
        System.out.println("1. Balok\n2. Kubus\n3. Bola");
        System.out.print("Masukkan pilihan : ");
        int pilihan = ruang.nextInt();
        double volume = 0.0;
        
        if(pilihan == 1){
            System.out.println("Masukkan panjang balok : ");
            double panjang = ruang.nextDouble();
            System.out.println("Masukkan lebar balok : ");
            double lebar = ruang.nextDouble();
            System.out.println("Masukkan tinggi balok : ");
            double tinggi = ruang.nextDouble();
            volume = panjang*lebar*tinggi;
        }else if(pilihan == 2){
            System.out.println("Masukkan panjang sisi kubus : ");
            double sisi = ruang.nextDouble();
            volume = sisi*sisi*sisi;
        }else if(pilihan == 3){
             System.out.println("Masukkan jari-jari :");
            double Jarijari = ruang.nextDouble();
           volume = (4.0/3.0)*Math.PI*Jarijari*Jarijari*Jarijari;
           
   
        } else{
            System.out.println("Pilihan tidak valid");
        }
        System.out.println("Volume bangun ruang : " + volume);
    }
    
}
