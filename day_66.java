package day_66;
import java.util.Scanner;
public class day_66 {
    public static double luas ( double p, double l){
        double L = 1 * l;
        return L;
    }
    public static double keliling ( double p, double l){
        double K = (2 * p) + (2 * l);
        return K;
    }
    
    public static void main(String[] args) {
        double L, K, p, l;
        Scanner masuk = new Scanner (System.in);
        System.out.print("Panjang : ");
        p = masuk.nextInt();
        System.out.print("Lebar : ");
        l = masuk.nextInt();
    System.out.println("------------------");
        System.out.println("L = "+ luas (p, l));
        System.out.println("K = "+ keliling (p, l));
    }
    
}