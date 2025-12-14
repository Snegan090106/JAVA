import java.util.Scanner;
public class Abs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0){
            a=-a;
        }
        System.out.println(a);
        sc.close();
    }
    
}