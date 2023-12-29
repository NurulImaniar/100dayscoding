package day_82;
public class day_82 {
    public static void main(String[] args) {
        int[][] angka = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Memanggil method untuk menampilkan array
        displayArray(angka);
        // Memanggil method untuk mencari elemen dalam array
        int TargetElement = 8;
        findElement(angka, TargetElement);
    }
    // Method untuk menampilkan array 2D
    public static void displayArray(int[][] array) {
        System.out.println("Isi array:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    // Method untuk mencari elemen dalam array 2D
    public static void findElement(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    System.out.println("Elemen " + target + " ditemukan pada index [" + i + "][" + j + "]");
                    return;
                }
            }
        }
    }
}
