//to check whether the last digit of a number is odd or even
public class Lastisoddoreven {
    public static void main(String[] args) {
        int number = 1234;
        int lastDigit = number % 10;
        if (lastDigit % 2 == 0) {
            System.out.println("The last digit " + lastDigit + " is an even number");
        } else {
            System.out.println("The last digit " + lastDigit + " is an odd number");
        }
    }
}