//Q15. Write a java program to print each digit of a number in words.
import java.util.Scanner;
public class Printdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        if (number == 0) {
            System.out.println("Zero");
        } else {
            String[] digitWords = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
            };
            StringBuilder result = new StringBuilder();
            int reversedNumber = 0;
            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            while (reversedNumber > 0) {
                int digit = reversedNumber % 10;
                result.append(digitWords[digit]).append(" ");
                reversedNumber /= 10;
            }
            System.out.println("The digits in words are: " + result.toString().trim());
        }
        scanner.close();
    }
}