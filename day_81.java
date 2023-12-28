package day_81;
public class day_81 {
    public static void main(String[] args) {
        int[] array = {13, 22, 31, 44, 57, 61, 79, 58, 92, 11};
        
        int index = 0;
        int jumlahGanjil = 0;
        int jumlahGenap = 0;

        while (index < array.length) {
            if (array[index] % 2 == 0) {
                jumlahGenap++;
            } else {
                jumlahGanjil++;
            }
            index++;
        }

        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
        System.out.println("Jumlah bilangan genap: " + jumlahGenap);
    }
}
