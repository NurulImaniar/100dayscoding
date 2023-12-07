package day_60;
import java.util.Scanner;
public class day_60 {
    public static void operasi (int a, int b){
        int c ;
        c = a + b;
        System.out.println(a+" + "+b+" = "+c);
        c = a - b;
        System.out.println(a+" - "+b+" = "+c);
        c = a * b;
        System.out.println(a+" * "+b+" = "+c);
        c = a / b;
        System.out.println(a+" : "+b+" = "+c);
        c = a % b;
        System.out.println(a+" % "+b+" = "+c);
    }
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int a,b;
        System.out.print("a = ");
        a = masuk.nextInt();
        System.out.print("b = ");
        b = masuk.nextInt();
        System.out.println("Output : ");
        operasi(a,b);
    }
    
}