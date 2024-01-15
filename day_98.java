package day_98;
public class day_98 {
    public static void main(String[] args) {
        
        String[][][] daftarHewan = {
                {{"Anjing", "Ayam"}, {"Angsa", "Armadillo"}},
                {{"Anoa", "Aso"}, {"Alpaca", "Ayam Betina"}}
        };
        
        System.out.println("Hewan dengan awalan huruf 'A':");
        cariDanTampilkanHewanA(daftarHewan);
    }

    private static void cariDanTampilkanHewanA(String[][][] daftarHewan) {
        for (String[][] dimensi2 : daftarHewan) {
            for (String[] dimensi1 : dimensi2) {
                for (String hewan : dimensi1) {
                    if (hewan.startsWith("A")) {
                        System.out.println(hewan);
                    }
                }
            }
        }
    }
}
