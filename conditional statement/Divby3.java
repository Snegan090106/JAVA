// to find whether the last digit of given number is divisible by 3
public class Divby3 {
    public static void main(String[] args) {
        int number = 12345;
        int lastDigit = number % 10;
        if (lastDigit % 3 == 0) {
            System.out.println("The last digit " + lastDigit + " of number " + number + " is divisible by 3");
        } else {
            System.out.println("The last digit " + lastDigit + " of number " + number + " is not divisible by 3");
        }
    }
}