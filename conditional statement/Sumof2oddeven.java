//to check whether the sum of two numbers is even or odd
public class Sumof2oddeven {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int sum = a + b;
        if (sum % 2 == 0) {
            System.out.println("The sum " + sum + " is an even number");
        } else {
            System.out.println("The sum " + sum + " is an odd number");
        }
    }
}