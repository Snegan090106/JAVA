//Q13. Write a java program to remove all zeroes from a given number.
import java.util.Scanner;
public class Removezero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int digit = number % 10;
            if (digit != 0) {
                result.insert(0, digit);
            }
            number /= 10;
        }
        if (result.length() == 0) {
            System.out.println("The number after removing zeroes is: 0");
        } else {
            System.out.println("The number after removing zeroes is: " + result.toString());
        }
        scanner.close();
    }
}