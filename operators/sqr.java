//to print the square of a given number
import java.util.Scanner;
public class sqr{   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        double square=num*num; //formula to calculate square of a number is number*number
        System.out.println(square);
        sc.close();
    }
}