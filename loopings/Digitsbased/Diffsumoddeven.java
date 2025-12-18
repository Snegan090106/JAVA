//Q12. Write a java program to find the difference between the sum of even digits and odd digits of a number.
import java.util.Scanner;
public class Diffsumoddeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        int sumEven = 0;
        int sumOdd = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            number /= 10;
        }
        int difference = sumEven - sumOdd;
        System.out.println("The difference between the sum of even digits and odd digits is: " + difference);
        scanner.close();
    }
}