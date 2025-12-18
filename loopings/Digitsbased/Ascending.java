//Q5. Write a java program to check whether the digits of a number are in ascending order.

import java.util.Scanner;
public class Ascending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
                number = Math.abs(number);
        boolean isAscending = true;
        int previousDigit = 10; // Initialize to a value greater than any digit (0-9)
                while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit >= previousDigit) {
                isAscending = false;
                break;
            }
            previousDigit = currentDigit;
            number /= 10;
        }
        if (isAscending) {
            System.out.println("The digits are in ascending order.");
        } else {
            System.out.println("The digits are not in ascending order.");
        }
        scanner.close();
    }
}