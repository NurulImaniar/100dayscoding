package day_100;
public class day_100 {
    public static void main(String[] args) {
        String[][][] daftarBunga = {
                {{"Mawar", "Melati", "Matahari"}, {"Anggrek", "Azalea", "Aster"}},
                {{"Margarita", "Marigold", "Magnolia"}, {"Alamanda", "Aconitum", "Adenium"}}
        };
        
        System.out.println("Nama bunga dengan awalan huruf 'm':");
        cariDanTampilkanBunga(daftarBunga, 'm');
        
        System.out.println("\nNama bunga dengan awalan huruf 'a':");
        cariDanTampilkanBunga(daftarBunga, 'a');
    }

    // Metode untuk mencari dan menampilkan nama bunga dengan awalan huruf tertentu
    private static void cariDanTampilkanBunga(String[][][] daftarBunga, char awalan) {
        for (String[][] dimensi2 : daftarBunga) {
            for (String[] dimensi1 : dimensi2) {
                for (String bunga : dimensi1) {
                    if (bunga.toLowerCase().startsWith(String.valueOf(awalan))) {
                        System.out.println(bunga);
                    }
                }
            }
        }
    }
}
