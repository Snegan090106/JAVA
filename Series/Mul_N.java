import java.util.Scanner;
public class Mul_N{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int multiple=n*i;
            System.out.println(multiple);
        }
        sc.close();
    }
}