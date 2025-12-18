//Q14. Write a java program to calculate the sum of squares and cubes of digits of a number.
import java.util.Scanner;
public class Sumsqrqube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        int sumSquares = 0;
        int sumCubes = 0;
        while (number > 0) {
            int digit = number % 10;
            sumSquares += digit * digit;
            sumCubes += digit * digit * digit;
            number /= 10;
        }
        System.out.println("The sum of squares of digits is: " + sumSquares);
        System.out.println("The sum of cubes of digits is: " + sumCubes);
        scanner.close();
    }
}