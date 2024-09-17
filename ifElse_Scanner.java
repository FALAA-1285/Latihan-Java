
import java.util.Scanner;

public class ifElse_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("Masukkan nilai n ");
        n=input.nextInt();

        if (n%2==0){
            if (n>=2&&n<=5){
                System.out.println("Bilangan tersebut 2-5");
            }
            else{
            if (n>=6&&n<=20){
                    System.out.println("Bilangan tersebut 6-20");
                }
                else {
                System.out.println("Bilangan lebih dari 20");
                    }
            }
        }else{
            System.out.println("Bilangan tersebut ganjil");
        }
    }
}
