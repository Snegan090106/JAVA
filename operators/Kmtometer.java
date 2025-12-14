import java.util.Scanner;
public class Kmtometer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int km=sc.nextInt();
        int m=km*1000;
        System.out.println(m);
        sc.close();
    }
}
