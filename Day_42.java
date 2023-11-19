package Day_42;
import java.util.Scanner;
public class Day_42 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input (L/P) : ");
        String pilih = input.nextLine();
        
        switch (pilih) {
            case "L" :
                 System.out.println("Laki-laki");
                 break;
            case "P" :
                 System.out.println("Perempuan");
                 break;
            default :
                 System.out.println("Pilihan salah");
                 break;
        }
        
    }
    
}