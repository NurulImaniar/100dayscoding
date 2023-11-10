package Day_33;

public class Day_33 {
    
    public static void main(String[] args) {
        int [] angka = {8,6,4,2,12,10};
        int total = 0;
        int rata;
        int Jumlah_Index = angka.length;
        System.out.println("Deret angka : ");
        for(int nilai = 0; nilai < Jumlah_Index; nilai++){
            System.out.println(angka[nilai]+ " ");
            total += angka[nilai];
        }
        System.out.println(" ");
        System.out.println("Total : "+total);
        rata = total / Jumlah_Index;
        System.out.println("Rata-rata : "+rata);
        
        //rata = total / Jumlah_Index
         //    = {8,6,4,2,12,10} / 6
        
        
    }
    
}