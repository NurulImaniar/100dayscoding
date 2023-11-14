package Day_37;
import java.util.Scanner;
public class Day_37 {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String [] buah = {
            "Anggur",
            "Melon",
            "Pisang",
            "Apel",
            "Semangka"
        };
        int data = 0;
        String cari;
        for (int manis = 0; manis < buah.length; manis++){
            System.out.println((manis+1)+"."+buah[manis]);
        }
        System.out.println("----------------");
        System.out.print("Cari : ");
        cari = masuk.nextLine();
        for (int manis = 0; manis < buah.length; manis++){
            if (cari.equals(buah[manis])){
                System.out.println("Nomor "+ (manis+1));
                data++;
            }
        }
        if (data == 0){
            System.out.println("Data tidak ada !");
        }
    }
    
}