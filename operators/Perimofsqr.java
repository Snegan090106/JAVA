//to find Perimeter of a Square
import java.util.Scanner;
public class Perimofsqr {   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double side=sc.nextDouble();
        double perimeter=4*side; // formula to calculate perimeter of square is 4*side
        System.out.println(perimeter);
        sc.close();
    }
}