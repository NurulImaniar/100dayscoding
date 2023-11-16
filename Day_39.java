package Arr_mul_leng;
public class Day_39 {
    public static void main(String[] args) {
        
        String[][] kartu = {
            {"Tri", "\t (*123#) ", " - Call center"},
            {"Telkomsel", "\t (*888#) "},
            {"Exis", "\t (*555#) ", " - Bonus nelpon"}
        };
        for (int data = 0; data < kartu.length; data++){
            for (int kuota =0; kuota < kartu[data].length; kuota++){
                System.out.print(kartu[data][kuota]);
            }
            System.out.println(" ");
        }
    }
    
}