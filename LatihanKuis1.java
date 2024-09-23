import java.util.Scanner;

public class LatihanKuis1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double HargaKG=2000, kiloan, totalharga;

        System.out.print("Masukkan jumlah kiloan loundry? ");
        kiloan=sc.nextDouble();

        totalharga=HargaKG* kiloan;

        System.out.println("Maka biaya yang harus dibayar adalah"+ totalharga);


    }
}