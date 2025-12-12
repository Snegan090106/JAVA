 //to calculate the average of three numbers
import java.util.Scanner;
class AvgOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println(average);
        sc.close();
    }
}