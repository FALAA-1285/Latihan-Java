import java.util.Scanner;

public class segitiga {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int panjang, lebar, keliling;

        System.out.print("Masukkan panjang taman anda: ");
        panjang=sc.nextInt();
        System.out.print("Masukkan lebar ukuran taman anda: ");
        lebar=sc.nextInt();

        keliling=(lebar+panjang)*2;

        System.err.println("Ukuran keliling taman anda adalah "+keliling);
        
    }
}