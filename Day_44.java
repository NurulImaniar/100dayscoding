package Day_44;
import java.util.Scanner;
public class Day_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        // Membuat array dinamis menggunakan ArrayList
        java.util.ArrayList<String> dynamicArray = new java.util.ArrayList<>();

        while (true) {
            System.out.println("1.Tambahkan data\n2.Lihat data\n3.Hapus data\n0.Keluar");
            System.out.print("Pilih operasi (0-3): ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data: ");
                    String data = input.next();
                    dynamicArray.add(data);
                    System.out.println("Data berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("Data saat ini:");
                    for (String element : dynamicArray) {
                        System.out.println(element);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan index data yang ingin dihapus : ");
                    int hapus= input.nextInt();
                    if (hapus >= 0 && hapus < dynamicArray.size()) {
                        dynamicArray.remove(hapus);
                        System.out.println("Data berhasil dihapus.");
                    } else {
                        System.out.println("Index tidak valid.");
                    }
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali : ");
                    break;
            }
        }
    }
    
}