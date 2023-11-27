package day_50;

public class Day_50 {
    
    public static void main(String[] args) {
        int[][][][] angka = {{{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}, {{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}}};

for (int i = 0; i < angka.length; i++) {
    
    for (int j = 0; j < angka[i].length; j++) {
        
        for (int k = 0; k < angka[i][j].length; k++) {
            
            for (int l = 0; l < angka[i][j][k].length; l++) {
                
                System.out.print(angka[i][j][k][l] + " ");
            }
            System.out.println(); // Baris baru setelah setiap baris array dalam dimensi ketiga
        }
        System.out.println(); // Baris baru setelah setiap dimensi kedua
    }
    System.out.println(); // Baris baru setelah setiap dimensi pertama
}

    }
    
}