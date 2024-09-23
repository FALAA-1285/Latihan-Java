
import java.util.Scanner;

public class Latihankuis7 {
    public static void main(String[] args) {
        int hambatan1, hambatan2, hambatan3, hambatan4, hambatan, v;
        Scanner sc =new Scanner(System.in);

        System.out.print("Masukkan hambatan 1 ");
        hambatan1=sc.nextInt();
        System.out.print("Masukkan  hambatan 2 ");
        hambatan2=sc.nextInt();
        System.out.print("Masukkan habatan 3 ");
        hambatan3=sc.nextInt();
        System.out.print("Masukkan hambatan 4 ");
        hambatan4=sc.nextint();

        hambatan=1/((1/hambatan1)+(1/hambatan2)+(1/hambatan3));
        v= hambatan+hambatan4;


    }

    
}
