package day_11;
public class Day_35 {
    public static void main(String[] args) {
       int [] bilangan = {-5,8,7,11,56,-2,79,0,2,10};
       int JumlahIndex = bilangan.length;
       int max = bilangan[0], min = bilangan[0];
        System.out.print("Deret bilangan : ");
        for (int nilai = 0; nilai < JumlahIndex; nilai++){
             System.out.print(bilangan[nilai]+" ");
             if (bilangan[nilai] > max){
                 max = bilangan[nilai];
             }
             if (bilangan[nilai] < min){
                 min = bilangan[nilai];
             }
        }
        System.out.println(" ");
        System.out.println("Maximal : "+max);
        System.out.println("Minimal : "+min);
        
       
       
       
       
    }
    
}
