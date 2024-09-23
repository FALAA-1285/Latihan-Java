
import java.util.Scanner;

public class Latihankuis5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double hambatan1,hambatan2, hambatan3, hasil;

        System.out.print("Masukkan hambatan 1 ");
        hambatan1=sc.nextDouble();
        System.out.print("Masukkan hambatan 2 ");
        hambatan2=sc.nextDouble();
        System.out.print("Masukkan hambatan 3 ");
        hambatan3=sc.nextDouble();

        hasil=1/((1/hambatan1)+(1/hambatan2)+(1/hambatan3));

        System.out.print("Maka hasil hambatan total adalah "+hasil);
    }
    
}
