package day_11;
import java.util.Scanner;
public class Day_23 {
    public static void main(String[] args) {
        Scanner open = new Scanner (System.in);
        
        System.out.print("Masukkan Nama :");
        String _nama = open.nextLine();
        System.out.print("Masukkan Pekerjaan : ");
        String pekerjaan = open.nextLine();
        System.out.print("Masukkan Gaji/ bulan : ");
        double Gaji_bulanan = open.nextDouble();
        
        double pajak = 0;
        double bantuan = 0;
        if (Gaji_bulanan > 3000000 ){
            pajak = Gaji_bulanan * 5 / 100;
          System.out.println("Pajak 5%");
        }else if (Gaji_bulanan > 10000000){
            pajak = Gaji_bulanan * 15 / 100;
            System.out.println("Pajak 15%");
        }else{
            pajak = 0;
        }
        if (pekerjaan.equalsIgnoreCase("petani")){
            bantuan = 1000000;
        }else if (pekerjaan.equalsIgnoreCase("pns")){
            bantuan = 0;
        }else{
            bantuan = 200000;
        }
        double Gaji_Bersih = Gaji_bulanan - pajak + bantuan;
        System.out.println("Nama : "+ _nama);
        System.out.println("Penghasilan bersih : "+ Gaji_Bersih);
       
       
//buatkan sebuah program yang menginputkan nama, penghasilan bulanan, pekerjaan
//
//memiliki kondisi Ketika penghasilan perbulan lebih dari 3jt maka mendapat pajak 5%
//jika penghasilan lebih dari 10jt maka mendapat pajak 15%
//lalu Ketika pekerjaan beliau adalah petani maka akan mendapatkan bantuan dana sebesar 1.000.000 perbulan
//Jika pekerjaan PNS maka tidak mendapatkan apapun
//jika selain petani dan selain PNS maka mendapatkan bantuan sebesar 200.000
//
//lalu hitung total gaji bersih perbulanny

        
    }
    
}
