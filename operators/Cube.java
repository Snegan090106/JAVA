// to print the cube of a given number
import java.util.Scanner;
class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cube = num * num * num;
        System.out.println(cube);
        sc.close();
    }
}