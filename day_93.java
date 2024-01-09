package day_93;
public class day_93 {
    public static void main(String[] args) {
        
        int[][][] array3D = {
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}, {10, 11, 12}}
        };
        // Memanggil fungsi untuk mencari bilangan genap
        cariBilanganGenap(array3D);
    }

    public static void cariBilanganGenap(int[][][] array) {
        System.out.println("Bilangan genap dalam array 3D:");

        // Looping untuk mencari bilangan genap
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k] % 2 == 0) {
                        System.out.println(array[i][j][k]);
                    }
                }
            }
        }
    }
}
