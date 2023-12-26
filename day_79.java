package day_79;
import java.util.Scanner;
public class day_79 {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjangArray = masuk.nextInt();

        int[] array = new int[panjangArray];

        System.out.println("Masukkan index array:");
        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Index ke-" + (i + 1) + ": ");
            array[i] = masuk.nextInt();
        }

        int jumlahGanjil = 0;
        int jumlahGenap = 0;
        int i = 0;

        do {
            if (array[i] % 2 == 0) {
                jumlahGenap++;
            } else {
                jumlahGanjil++;
            }
            i++;
        } while (i < panjangArray);

        System.out.println("Jumlah bilangan genap: " + jumlahGenap);
        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);

        masuk.close();
    }
}
