//Q2. Write a java program to find whether the first digit of a given number is odd or even.
import java.util.Scanner;
public class Fstisoddoreven {
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
        
        // Check if the first digit is odd or even
        if (number % 2 == 0) {
            System.out.println("The first digit " + number + " is even.");
        } else {
            System.out.println("The first digit " + number + " is odd.");
        }
        
        scanner.close();
    }
}