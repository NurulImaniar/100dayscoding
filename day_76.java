package day_76;

public class day_76 {
    
    public static void main(String[] args) {
        String[][][] arrayBuah = {
                {{"Apel", "Jeruk", "Mangga"}, {"Anggur", "Pisang", "Strawberry"}},
                {{"Durian", "Rambutan", "Manggis"}, {"Nanas", "Semangka", "Melon"}}
        };
        
        System.out.println("Isi array buah:");
        for (int i = 0; i < arrayBuah.length; i++) {
            for (int j = 0; j < arrayBuah[i].length; j++) {
                for (int k = 0; k < arrayBuah[i][j].length; k++) {
                    System.out.print(arrayBuah[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
