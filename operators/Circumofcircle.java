//to find Circumference of a Circle
import java.util.Scanner;
class Circumofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double circumference = 2 * Math.PI * radius;
        System.out.println(circumference);
        sc.close();
    }
}