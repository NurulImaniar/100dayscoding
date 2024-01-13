package day_96;

public class day_96 {
    
    public static void main(String[] args) {
        
        String[] namaHewan = {"Anjing", "Ayam", "Angsa", "Ular", "Kucing"};

        // Mencari nama hewan dengan awalan huruf 'A'
        System.out.println("Nama hewan dengan awalan 'A':");
        for (String hewan : namaHewan) {
            if (hewan.startsWith("A")) {
                System.out.println(hewan);
            }
        }
    }
}
