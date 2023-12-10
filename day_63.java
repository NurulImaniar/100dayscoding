package day_11;

public class day_63 {
     public static double HitungLuas (double JariJari) {
        // Rumus luas lingkaran: π * r * r
        double luas = Math.PI * JariJari * JariJari;
        return luas;
    }
    public static void main(String[] args) {
        // Contoh penggunaan fungsi
        double JariJariLingkaran = 4.0;
        double HasilLuas = HitungLuas(JariJariLingkaran);

        System.out.println("Luas Lingkaran dengan jari-jari " + JariJariLingkaran + " adalah: " + HasilLuas);
    
    }
    
}
