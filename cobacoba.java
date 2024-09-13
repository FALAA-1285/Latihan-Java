
import java.util.Scanner;

public class cobacoba {
    public static void main(String[] args) {
        
        String informatics;
        boolean coding=true;
        System.out.println("Hello world");

        Scanner sc=new Scanner (System.in);
        System.out.println("Are you informatics? ");
        informatics=sc.nextLine();
        if(informatics.equals("yes")){
            for(int skill=0; coding==true; skill++ ){
                System.out.println("Happy Programmer,s Day");
            }
        }
    }
    
}
