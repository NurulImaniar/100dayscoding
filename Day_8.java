
package day_8;

public class Day_8 {
    public static void main(String[] args) {
        // Operator logika boolean
        /*
        Not (Kebalikan) ! 
        And (Dan)       &&
        Or  (Atau)      ||
        */
        
        boolean nilai = true;
        System.out.println(!nilai);
        
        boolean hasil1 = true;
         boolean hasil2 = true;
        boolean hasil3 = false;
        System.out.println(hasil1 && hasil2);
        System.out.println(hasil1 && hasil3);
        
        boolean angka1 = true;
        boolean angka2 = true;
        boolean angka3 = false;
        boolean angka4 = false;
        
        System.out.println(angka1 || angka2);
        System.out.println(angka3 || angka4);
        System.out.println(angka2 || angka4);
        
        
        
    }
    
}
