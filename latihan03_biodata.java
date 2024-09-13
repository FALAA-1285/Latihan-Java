import java.util.Scanner;

public class latihan03_biodata{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String nama, nim, kelas, noAbsen, alamat, noHP, hobi;

        System.out.print("Masukkan nama mahasiswa: ");
        nama=sc.nextLine();
        System.out.print("Masukkan nim mahasiswa: ");
        nim=sc.nextLine();
        System.out.print("Masukkan kelas mahasiswa: ");
        kelas=sc.nextLine();
        System.out.print("Masukkan no. absen mahasiswa: ");
        noAbsen=sc.nextLine();
        System.out.print("Masukkan alamat mahasiswa: ");
        alamat=sc.nextLine();
        System.out.print("Masukkan no. handphone mahasiswa: ");
        noHP=sc.nextLine();
        System.out.print("Masukkan hobi mahasiswa: ");
        hobi=sc.nextLine();

        System.out.println("---------------------------------------------------------");
        System.out.println("-- Data Mahasiswa Jurusan Teknologi Informasi Polinema--");
        System.out.println("---------------------------------------------------------");
        System.out.println("Nama     : "+nama);
        System.out.println("NIM      : "+nim);
        System.out.println("Kelas    : "+kelas);
        System.out.println("No Absen : "+noAbsen);
        System.out.println("Alamat   : "+alamat);
        System.out.println("No HP    : "+noHP);
        System.out.println("Hobi     : "+hobi);
    }
}
