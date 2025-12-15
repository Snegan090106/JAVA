//to check whether two numbers have the same last digit
public class Smaelast {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 453;
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        if (lastDigit1 == lastDigit2) {
            System.out.println("Both numbers have the same last digit: " + lastDigit1);
        } else {
            System.out.println("The numbers do not have the same last digit");
        }
    }
}