//to print the middle digit of a 3-digit number.
import java.util.Scanner;
public class Thirddigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int mid=(a/10)%10;//365/10=36%10=6
        System.out.println(mid);
        sc.close();
    }
    
}