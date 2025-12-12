// to check if a number is power of 2 using bitwise AND.
import java.util.Scanner;
class BitAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPowerOfTwo = (num > 0) && ((num & (num - 1)) == 0);
        System.out.println(isPowerOfTwo);
        sc.close();
    }
}