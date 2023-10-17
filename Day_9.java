package day_9;
public class Day_9 {
    public static void main(String[] args) {
        //Konvensi String ke tipe data primitif
        
        String nilai = "118";
        int total = Integer.parseInt(nilai);
        System.out.println(total);
        
        short total1 = Short.parseShort(nilai);
        System.out.println(total1);
        
        byte total2 = Byte.parseByte(nilai);
        System.out.println(total2);
        
        long total3 = Long.parseLong(nilai);
        System.out.println(total3);
        
        boolean total4 = Boolean.parseBoolean(nilai);
        System.out.println(total4);
        
        double total5 = Double.parseDouble(nilai);
        System.out.println(total5);
        
        float total6 = Float.parseFloat(nilai);
        System.out.println(total6);
       
        //Konvensi tipe data Primitif ke String
        int angka = 2005;
        String hasil = Integer.toString(angka);
        System.out.println(hasil);
       
        
    }
    
}
