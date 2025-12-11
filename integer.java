//to print given integer number
import java.util.Scanner;
public class integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The given integer is: " + number);
        sc.close();
    }
}