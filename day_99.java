package day_99;
public class day_99 {
    public static void main(String[] args) {
        String[][][] buahArray = {
            {{"Apel", "Anggur", "Alpukat"}, {"Belimbing", "Blewah", "Buah Naga"}},
            {{"Ceri", "Cempedak", "Coklat"}, {"Durian", "Duku", "Delima"}}
        };
        
        cariBuahAwalanC(buahArray);
    }

    public static void cariBuahAwalanC(String[][][] arrayBuah) {
        System.out.println("Daftar buah dengan awalan huruf 'C':");
        
        for (String[][] buah2D : arrayBuah) {
            for (String[] buah1D : buah2D) {
                for (String buah : buah1D) {
                    if (buah.startsWith("C")) {
                        System.out.println(buah);
                    }
                }
            }
        }
    }
}
