package Day_34;
import java.util.Arrays;
import java.util.Collections;
public class Day_34 {
    public static void main(String[] args) {
        Integer [] nilai = {22,45,78,95,12,8,3,11,98};
        int max = Collections.max(Arrays.asList(nilai));
        int min = Collections.min(Arrays.asList(nilai));
        System.out.print("Deret angka : ");
        for (int angka = 0; angka < nilai.length; angka++){
            System.out.print(nilai[angka]+" ");
        }
        System.out.println(" ");
        System.out.println("Maximum : "+max);
        System.out.print("Minimum : "+min);
    }
}