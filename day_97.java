package day_97;
public class day_97 {
    public static void main(String[] args) {
        
        String[] buahArray = {"Apel", "Jeruk", "Lemon", "Mangga", "Lengkeng"};
        
        cariBuahAwalanL(buahArray);
    }

    public static void cariBuahAwalanL(String[] buahArray) {
        System.out.println("Buah-buah dengan awalan huruf L:");

        // Loop untuk memeriksa setiap buah dalam array
        for (String buah : buahArray) {
            // Jika buah dimulai dengan huruf L, print nama buah
            if (buah.startsWith("L")) {
                System.out.println(buah);
            }
        }
    }
}
