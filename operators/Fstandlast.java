//to print the sum of the first and last digit of a 3-digit number.
import java.util.Scanner;
public class Fstandlast {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int first=a/100; //234/100=2
        int last=a%10;//234%10=4
        System.out.println(first+last);
        sc.close();
    }
    
}