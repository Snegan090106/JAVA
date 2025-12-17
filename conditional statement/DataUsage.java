import java.util.Scanner;
public class DataUsage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data=sc.nextInt();
        if (data<50) {
            System.out.println("Low Data");
        } else if (data==50) {
            System.out.println("Half Consumed");
        } else {
            System.out.println("Data Over");
        }
    }
}
