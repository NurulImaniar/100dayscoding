
package day_5;

public class Day_5 {

    public static void main(String[] args) {
        // Tipe data bilangan desimal
        
        float var = 11.9f;
        System.out.println("Nilai float  = " + var);
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar float = " + Float.BYTES);
        System.out.println("Besar float = " + Float.SIZE);
        
        //Operator Aritmatika
        int nilai1,nilai2;
        float hasil;
        nilai1 = 20;
        nilai2 = 3;
        System.out.println("Nilai1 = " + nilai1 );
        System.out.println("Nilai2 = " + nilai2 );
        
        hasil = nilai1 + nilai2;
        System.out.println("Hasil penjumlahan nilai1 dan nilai2 = " + hasil); 
        
        hasil = nilai1 - nilai2;
        System.out.println("Hasil pengurangan nilai1 dan nilai2 = " + hasil);
        
        hasil = nilai1 * nilai2;
        System.out.println("Hasil perkalian nilai1 dan nilai2 = " + hasil);
        
        hasil = nilai1 / nilai2;
        System.out.println("Hasil pembagian nilai1 dan nilai2 = " + hasil);
        
        hasil = nilai1 % nilai2;
        System.out.println("Hasilbagi dari nilai 1 dan 2 = " + hasil);
    }
    
}
