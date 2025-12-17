import java.util.Scanner;
public class SpeedCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed=sc.nextInt();
        if (speed>100) {
            System.out.println("Speed Limit Exceeded");
        } else {
            System.out.println("Speed Within Limit");
        }
    }
}
