//Q3. Write a java program to check whether the given digit is occurred in a number.
import java.util.Scanner;
public class Occuredinnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter a digit to search for: ");
        int digitToFind = scanner.nextInt();
        
        // Make the number positive if it's negative
        number = Math.abs(number);
        digitToFind = Math.abs(digitToFind);
        
        boolean found = false;
        
        // Loop to check each digit
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit == digitToFind) {
                found = true;
                break;
            }
            number /= 10;
        }
        
        // Output the result
        if (found) {
            System.out.println("The digit " + digitToFind + " is present in the number.");
        } else {
            System.out.println("The digit " + digitToFind + " is not present in the number.");
        }
        
        scanner.close();
    }
}