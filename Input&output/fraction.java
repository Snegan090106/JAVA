//to print the given fractional number.
import java.util.Scanner;
public class fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        System.out.println("The given fractional number is: " + number);
        sc.close();
    }
}