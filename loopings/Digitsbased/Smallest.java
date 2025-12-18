//Q10. Write a java program to find the smallest digit in a given number.
import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        int smallestDigit = 9;
        while (number > 0) {
            int digit = number % 10;
            if (digit < smallestDigit) {
                smallestDigit = digit;
            }
            number /= 10;
        }
        System.out.println("The smallest digit is: " + smallestDigit);
        scanner.close();
    }
}