package day_11;
import java.util.Scanner;
public class Day_22 {
    public static void main(String[] args) {
        Scanner open = new Scanner (System.in);
        System.out.println("Jenis buku (novel/majalah/komik) : ");
        String JenisBuku = open.nextLine();
        System.out.println("Area buku (A/B/C) : ");
        String AreaBuku = open.nextLine();
        
         if ((JenisBuku.equalsIgnoreCase("Novel") && AreaBuku.equalsIgnoreCase("A")) ||
            (JenisBuku.equalsIgnoreCase("Komik") && AreaBuku.equalsIgnoreCase("B")) ||
            (JenisBuku.equalsIgnoreCase("Majalah") && AreaBuku.equalsIgnoreCase("C"))) {
             System.out.println("benar");
         }else {
             System.out.println("salah");
         }
                    
        
   
        
    }
            
            }
    
    

