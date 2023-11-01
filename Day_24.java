package day_11;

public class Day_24 {
    public static void main(String[] args) {
        
        System.out.println("TOKOH BUAH SEJAHTERA");
        System.out.println("---------------------");
        int HargaApel_PerKg = 5_000;
        int JumlahApel = 20;
        int HargaAnggur_PerGram = 30;
        int JumlahAnggur = 18*1000; //Gram ke kilo
        int HargaRambutan_PerKg = 15_000;
        int JumlahRambutan = 17;
        int HargaJeruk_Per3Kg = 45_000;
        int JumlahJeruk = 29/3*3; // Membeli dalam kelipatan 3 kilogram
//Harga total jenis buah
double hargaApel = HargaApel_PerKg * JumlahApel;
double hargaAnggur = HargaAnggur_PerGram * JumlahAnggur;
double hargaRambutan = HargaRambutan_PerKg * JumlahRambutan;
double hargaJeruk = HargaJeruk_Per3Kg * (JumlahJeruk / 3);
        System.out.println("Harga apel : Rp. " + hargaApel );
        System.out.println("Harga anggur : Rp. " + hargaAnggur );
        System.out.println("Harga rambutan : Rp. " + hargaRambutan );
        System.out.println("Harga jeruk : Rp. " + hargaJeruk );
        System.out.println(" ");
        // Total berat dan bonus
        double totalBerat = JumlahApel + JumlahAnggur + JumlahRambutan + JumlahJeruk;
        double bonusApel = (JumlahApel / 5 * 0.5); // Bonus setiap 5kg buah
        double bonusAnggur =(JumlahAnggur / 5 * 0.5);
        double bonusRambutan =(JumlahRambutan / 5 * 0.5);
        double bonusJeruk =(JumlahJeruk / 5 * 0.5);
        double totalBonus = bonusApel + bonusAnggur + bonusRambutan + bonusJeruk;

        double hargaTotal = hargaApel + hargaAnggur + hargaRambutan + hargaJeruk;

        // Hitung diskon jika total berat melebihi 20kg
        double diskon = totalBerat > 20 ? (0.002 * hargaTotal) : 0;

        // Hitung total yang harus dibayar
        double totalPembayaran = hargaTotal - diskon;

       
        System.out.println("Harga total : Rp. " + hargaTotal);
        System.out.println("Total bonus : Rp. " + totalBonus);
        System.out.println("Total diskon : Rp. " + diskon );
        System.out.println("Total yang harus dibayar ucup : Rp. " + totalPembayaran );
        
        
        
    }
}
