
package day_6;
public class Day_6 {

    public static void main(String[] args) {
        // Operator penugasan bilangan desimal
        
        /*
        =
        +=
        -=
        *=
        /=
        %=
        
        */

        double angka,nilai;
        nilai = 8;
        angka = 3;
        
        System.out.println(nilai);
        nilai *= angka;
        System.out.println(nilai);
        
        System.out.println(angka);
        angka += 7;
        System.out.println(angka);
        
        System.out.println(nilai);
        nilai %= 9;
        System.out.println(nilai);
        
        System.out.println(angka);
        angka /= 2;
        System.out.println(angka);
        
        System.out.println(nilai);
        nilai -= angka;
        System.out.println(nilai);
    }
    
}
