
import java.util.Scanner;

public class Latihankuis6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hambatan1, hambatan2, hambatan3, hambatanT;

        System.out.print("Masukkan hambatan 1 ");
        hambatan1=sc.nextInt();
        System.out.print("Masukkan  hambatan 2 ");
        hambatan2=sc.nextInt();
        System.out.print("Masukkan habatan 3 ");
        hambatan3=sc.nextInt();

        hambatanT=hambatan1+hambatan2+hambatan3;

        System.out.print("Maka hambatan total adalah "+hambatanT);
    }
}
