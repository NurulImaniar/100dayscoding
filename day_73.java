package day_73;
import java.util.Scanner;
public class day_73 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Gaji pokok : ");
        double GajiPokok = masuk.nextDouble();
        System.out.print("Lama lembur (jam) : ");
        int LamaLembur = masuk.nextInt();

        
        double gajiLemburPerJam = 55000;
        double gajiLembur = gajiLemburPerJam * LamaLembur;
        double gajiBersih = GajiPokok + gajiLembur;

        System.out.println("--------------------");
        System.out.println("Gaji bersih: Rp. " + gajiBersih);

        masuk.close();
    }
}

