// to check odd or even using bitwise operator
public class Oddeven_bit {
    public static void main(String[] args) {
        int number = 15;
        if ((number & 1) == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}