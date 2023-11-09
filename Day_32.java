package Day_32;
import java.util.Scanner;
public class Day_32 {
    
    public static void main(String[] args) {
        int Jumlah_Index = 5;
        int angka [] = new int [Jumlah_Index];
        Scanner masuk = new Scanner(System.in);
        System.out.println("Input : ");
        System.out.println("--------------");
        for (int nilai = 0; nilai < Jumlah_Index; nilai++){
            System.out.print("Index-"+nilai+":");
            angka [nilai] = masuk.nextInt();
            
        }
        System.out.println("---------------");
        System.out.println("Output : ");
        for(int nilai = 0; nilai < Jumlah_Index; nilai++){
            System.out.print(angka[nilai]+" ");
        }
        
        
        
    }
    
}