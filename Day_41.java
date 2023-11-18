package Day_41;
import java.util.Scanner;
public class Day_41 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        System.out.print("Nilai awal : ");
        int Awal = masuk.nextInt();
        System.out.print("Nilai akhir : ");
        int Akhir = masuk.nextInt();

        int[] Genap = new int[(Akhir - Awal) / 2 + 1]; // Ukuran array untuk menyimpan bilangan genap

        int i = 0; 
        int nilai = Awal;

        do {
            if (nilai % 2 != 0) {
                System.out.println("Bilangan ganjil : " + nilai);
            } else {
                Genap[i] = nilai;
                i++;
            }

            nilai++;
        } while (nilai <= Akhir);

        // Bilangan genap yang disimpan dalam array
        System.out.print("Bilangan genap di dalam array : ");
        for (int bilangan : Genap) {
            if (bilangan != 0) {
                System.out.print(bilangan + " ");
            }
        }
    }


    }
    
