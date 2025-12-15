//to check whether the product of two numbers is positive or negative
public class Prodof2isoddoreven {
    public static void main(String[] args) {
        int a = -4;
        int b = 5;
        int product = a * b;
        if (product >= 0) {
            System.out.println("The product " + product + " is a positive number");
        } else {
            System.out.println("The product " + product + " is a negative number");
        }
    }
}