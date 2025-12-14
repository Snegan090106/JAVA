//swap two numbers without using third variable
import java.util.Scanner;
public class Swapwo3rd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
        sc.close();
    }
    
}
