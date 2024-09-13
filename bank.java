
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tabnganawal, lamaMenabung;
        double persentaseBunga=0.2, bunga, uangDitabung,  jumlahtabungan;

        System.out.print("Masukkan total tabungan awal anada: Rp ");
        tabnganawal = sc.nextInt();
        System.out.print("Masukkan lama anda menabung ");
        lamaMenabung = sc.nextInt();

        bunga=tabnganawal*persentaseBunga*lamaMenabung;
        jumlahtabungan=tabnganawal+bunga;

        System.out.print("Total bunga anda adalah: Rp " +bunga);
        System.out.print("Total Tabungan akhir anda adalah: Rp " +jumlahtabungan);
    }
    
}
