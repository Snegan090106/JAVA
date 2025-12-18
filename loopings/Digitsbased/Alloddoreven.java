//Q11. Write a java program to check whether all digits of a number are even or odd or mixed.
import java.util.Scanner;
public class Alloddoreven { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        boolean hasEven = false;
        boolean hasOdd = false;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
            number /= 10;
            if (hasEven && hasOdd) {
                break;
            }
        }
        if (hasEven && hasOdd) {
            System.out.println("The number has mixed digits.");
        } else if (hasEven) {
            System.out.println("All digits are even.");
        } else {
            System.out.println("All digits are odd.");
        }
        scanner.close();
    }
}