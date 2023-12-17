package day_70;
import java.util.Scanner;
public class day_70 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double  r1,r2,rTot,vR1,vR2,iR1,iR2;
        int vin = 9;
        System.out.print("Masukkan R1: ");
        r1 = scan.nextInt();
        System.out.print("Masukkan R2: ");
        r2 = scan.nextInt();
        rTot = r1 + r2;
        vR1 = r1/rTot*vin;
        vR2 = r2/rTot*vin;
        iR1 = vin/rTot;
        iR2 = vin/rTot;
        System.out.printf("Rtot = %f + %f\n    =%f\n",r1,r2,rTot);
        System.out.printf("VR1 = %f / %f * %d\n    =%f\n",r1,rTot,vin,vR1);
        System.out.printf("VR2 = %f / %f * %d\n    =%f\n",r2,rTot,vin,vR2);
        System.out.printf("IR1 = %d / %f\n    =%f\n",vin,rTot,iR1);
        System.out.printf("IR2 = %d / %f\n    =%f\n",vin,rTot,iR2);
        
    }
}
