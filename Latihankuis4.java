
import java.util.Scanner;

public class Latihankuis4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int akanDitempuh, kecepatan=2;
        double lanatempuh;

        System.out.print("Masukkan  jarak yang akan ditempuh dalam km adalah ");
        akanDitempuh=sc.nextInt();
        
        lanatempuh=akanDitempuh/kecepatan;

        System.out.print("lama waktu perjalanan yang akan ditempuh adalah  "+lanatempuh);
        System.out.println("/jam");
    }
    
}
