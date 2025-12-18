//Q1. Write a java program to print the first digit of a given number.
import java.util.Scanner;
public class Firstdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Make the number positive if it's negative
        number = Math.abs(number);
        
        // Loop to find the first digit
        while (number >= 10) {
            number /= 10;
        }
        
        System.out.println("The first digit is: " + number);
        scanner.close();
    }
}