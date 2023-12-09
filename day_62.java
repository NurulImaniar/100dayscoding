package day_11;

public class day_62 {
    
    public static String Gabung (String teks1,String teks2) {
       
        return teks1+ "" + teks2;
    }
    public static void main(String[] args) {
         // Contoh penggunaan fungsi
        String kata1 = "Aku adalah";
        String kata2 = " seorang pelajar";
        String hasilGabungan = Gabung (kata1, kata2);

        System.out.println("Hasil penggabungan: " + hasilGabungan);
       }
    }
    

