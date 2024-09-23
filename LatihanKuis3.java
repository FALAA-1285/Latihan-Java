
import java.util.Scanner;

public class LatihanKuis3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long totalterjual, jmlHari;
        double ratarata;

        System.out.print("Masukkan jumlah hari ");
        jmlHari=sc.nextLong();
        System.out.print("Masukkan total barang yang terjual ");
        totalterjual=sc.nextLong();

        ratarata=totalterjual/jmlHari;

        System.out.println("Maka rata rata barang yang terjual perhari "+ratarata);


    }
    
}
