
import java.util.Scanner;

public class LatihanKuis2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double perliter=9000, hargaygdibayar, jumlahBensin;

        System.out.print("Masukkan jumlah uang ");
        hargaygdibayar=sc.nextDouble();

        jumlahBensin=hargaygdibayar/perliter;

        System.out.print("Jumlah bensin yang diperoleh "+ jumlahBensin);
        System.out.println("liter");
    }
}
