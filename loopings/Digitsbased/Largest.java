//Q9. Write a java program to find the largest digit in a given number.
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        int largestDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number /= 10;
        }
        System.out.println("The largest digit is: " + largestDigit);
        scanner.close();
    }
}