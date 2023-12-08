package day_61;
public class day_61 {
    public static int LuasPersegi (int s) {
        int luas = s * s;
        return(luas);
    }
    public static int KelilingPersegi (int s){
        int keliling = 4 * s;
        return(keliling);
    }
    public static void main(String[] args) {
        int s;
        s = 8;
        System.out.println("Luas = "+LuasPersegi(s));
        System.out.println("Keliling = "+KelilingPersegi(s));
    }
    
}