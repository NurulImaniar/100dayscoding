package day_84;
public class day_84 {
    public static void main(String[] args) {
        int[] arrayAngka = {2, 5, 7, 12, 13, 17, 20};

        System.out.println("Bilangan prima dalam array :");
        for (int angka : arrayAngka) {
            if (isPrima(angka)) {
                System.out.print(angka + " ");
            }
        }
    }
    // Method untuk mengecek apakah suatu bilangan prima
    private static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}
