//to check whether the first digit of a 3 digit number is odd or even
public class Fstisoddeven {
    public static void main(String[] args) {
        int number = 345;
        int firstDigit = number / 100;
        if (firstDigit % 2 == 0) {
            System.out.println("The first digit " + firstDigit + " is an even number");
        } else {
            System.out.println("The first digit " + firstDigit + " is an odd number");
        }
    }
}