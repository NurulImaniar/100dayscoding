package Prosedur_Fungsi;
public class Day_40 {
    
    //Prosedur
    public static void siswa (){
        String nama = "Bulan";
        int umur = 18;
        System.out.println(nama+"\t - "+umur+" th ");
    }
    //Fungsi
    public static String siswi (){
        String nama = "Bintang";
        int umur = 16;
        return nama+"\t - "+umur+" th ";
    }
    
    public static void main(String[] args) {
        siswa(); //Pemanggilan prosedur
        System.out.println(siswi()); //pemanggilan funsi
    }
    
}