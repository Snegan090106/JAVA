//Q6. Write a java program to check whether the digits of a number are in descending order.
import java.util.Scanner;
public class Descending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        boolean isDescending = true;
        int previousDigit = -1; // Initialize to a value less than any digit (0-9)
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit <= previousDigit) {
                isDescending = false;
                break;
            }
            previousDigit = currentDigit;
            number /= 10;
        }
        if (isDescending) {
            System.out.println("The digits are in descending order.");
        } else {
            System.out.println("The digits are not in descending order.");
        }
        scanner.close();
    }
}