import java.util.Scanner;
public class Studcandie {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//50
        int b=sc.nextInt();//6
        int eachgets=a/b;//8
        int remains=a&b;
        System.out.println("Each student gets:"+eachgets);
        System.out.println("remaining candies:"+remains);
        sc.close();
    }
}
