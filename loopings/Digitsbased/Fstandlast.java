//Q7. Write a java program to swap the first and last digit of a given number.
import java.util.Scanner;
public class Fstandlast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        int lastDigit = number % 10;
        int firstDigit = number;
        int digitCount = 0;
        while (firstDigit >= 10) {
            firstDigit /= 10;
            digitCount++;
        }
        if (digitCount == 0) {
            System.out.println("The number after swapping is: " + number);
            scanner.close();
            return;
        }
        int multiplier = (int) Math.pow(10, digitCount);
        int middlePart = (number % multiplier) / 10;
        int swappedNumber = lastDigit * multiplier + middlePart * 10 + firstDigit;
        System.out.println("The number after swapping is: " + swappedNumber);
        scanner.close();
    }
}