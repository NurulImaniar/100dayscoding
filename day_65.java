package day_65;

public class day_65 {
    public static double luas ( double p, double l){
        double L = 1 * l;
        return L;
    }
    public static double keliling ( double p, double l){
        double K = (2 * p) + (2 * l);
        return K;
    }
    
    public static void main(String[] args) {
        double L, K, p, l;
        p = 6;
        l = 4;
        System.out.println("L = "+ luas (p, l));
        System.out.println("K = "+ keliling (p, l));
    }
    
}