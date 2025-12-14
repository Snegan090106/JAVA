//to find Perimeter of a Rectangle
import java.util.Scanner;
class Perimofrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int perimeter = 2 * (length + breadth);
        System.out.println(perimeter);
        sc.close();
    }
}