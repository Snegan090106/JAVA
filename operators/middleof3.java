//to print the middle digit of a 3-digit number.
import java.util.Scanner;
public class middleof3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int middleDigit=(num/10)%10;
        System.out.println(middleDigit);
        sc.close();
    }
}