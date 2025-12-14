import java.util.Scanner;
public class Quadrant{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>y&&x>y){
          System.out.println("1st");
        }else if(x>y&&x<y){
            System.out.println("2nd");
        }else if(x<y&&x<y){
            System.out.println("3rd");
        }else if(x<y&&x>y){
            System.out.println("4th");
        }
        sc.close();
    }
    }