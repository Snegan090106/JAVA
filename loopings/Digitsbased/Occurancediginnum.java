//Q4. Write a java program to count the occurrence of a digit in a number.
import java.util.Scanner;
public class Occurancediginnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter a digit to count its occurrences: ");
        int digitToCount = scanner.nextInt();
                number = Math.abs(number);
        digitToCount = Math.abs(digitToCount);
        int count = 0;
                while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit == digitToCount) {
                count++;
            }
            number /= 10;
        }
        System.out.println("The digit " + digitToCount + " occurs " + count + " time(s) in the number.");
        scanner.close();
    }
}