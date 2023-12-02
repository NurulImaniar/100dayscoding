package day_55;
import java.util.ArrayList;
public class day_55 {
    public static void main(String[] args) {
        String[] buahArray = {"Apel", "Jeruk", "Mangga"};
        // Perulangan for each untuk array
        for (String buah : buahArray) {
            System.out.println(buah);
        }
        // Contoh ArrayList buah
        ArrayList<String> buahList = new ArrayList<>();
        buahList.add("Anggur");
        buahList.add("Pisang");
        buahList.add("Semangka");

        // Perulangan for each untuk ArrayList
        for (String buah : buahList) {
            System.out.println(buah);
        }
    }
}