package day_11;
import java.util.Scanner;
public class Day_28 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        
        System.out.print("Masukkan angka : ");
        double angka = masuk.nextDouble();
        System.out.print("Masukkan satuan (m, cm, km) : ");
        String SatuanAwal = masuk.next();
        System.out.print("Masukkan konvensi (mm, cm, km) : ");
        String SatuanKonvensi = masuk.next();
        
          while (SatuanAwal.equals(SatuanKonvensi)) {
            System.out.println("Satuan konversi harus berbeda dari satuan awal");
            System.out.print("Masukkan konvensi (mm, cm, km) : ");
            SatuanKonvensi = masuk.next();
        double Hasil_Konvensi = 0;
        
        if (SatuanAwal.equals("m")) {
            if (SatuanKonvensi.equals("mm")) {
                Hasil_Konvensi = angka * 1000;
            } else if (SatuanKonvensi.equals("cm")) {
                Hasil_Konvensi = angka * 100;
            } else if (SatuanKonvensi.equals("km")) {
                Hasil_Konvensi = angka / 1000;
            }
        } else if (SatuanAwal.equals("cm")) {
            if (SatuanKonvensi.equals("mm")) {
                Hasil_Konvensi = angka * 10;
            } else if (SatuanKonvensi.equals("m")) {
                Hasil_Konvensi = angka / 100;
            } else if (SatuanKonvensi.equals("km")) {
                Hasil_Konvensi = angka / 100000;
            }
        } else if (SatuanAwal.equals("km")) {
            if (SatuanKonvensi.equals("mm")) {
                Hasil_Konvensi = angka * 1000000;
            } else if (SatuanKonvensi.equals("cm")) {
                Hasil_Konvensi = angka * 100000;
            } else if (SatuanKonvensi.equals("m")) {
                Hasil_Konvensi = angka * 1000;
            }
        }
        System.out.println("Hasil konversi: " + Hasil_Konvensi + " " + SatuanKonvensi);
        
        }
            }
}


       
    

