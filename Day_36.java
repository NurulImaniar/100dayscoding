package day_11;
import java.util.Scanner;
public class Day_36 {
    public static void main(String[] args) {
        int [] data = {3,5,6,8,9,3,4,2,0};
        int cari,hasil = 0;
        Scanner open = new Scanner (System.in);
        System.out.print("Data : ");
        for (int nilai = 0; nilai < data.length; nilai++){
            System.out.print(data [nilai] + " ");
        }
        System.out.println(" ");
        System.out.print("Cari : ");
        cari = open.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hasil cari : ");
        for (int nilai = 0; nilai < data.length; nilai++){
            if (cari == data[nilai]){
                System.out.println("Index-"+ nilai);
            }
        }
        if (hasil == 0){
            System.out.println("Data tidak tersedia !");
        }
    }
    
}
