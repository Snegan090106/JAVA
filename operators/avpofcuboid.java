 //to find Surface Area and Volume of a cuboid
import java.util.Scanner;
class Avpofcuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();
        double surfaceArea = 2 * (length * breadth + breadth * height + height * length);
        double volume = length * breadth * height;
        System.out.printf("Surface Area: %.2f\n", surfaceArea);
        System.out.printf("Volume: %.2f\n", volume);
        sc.close();
    }
}