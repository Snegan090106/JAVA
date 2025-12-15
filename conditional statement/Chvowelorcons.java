import java.util.Scanner;
public class Chvowelorcons {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
       char ch=Character.toLowerCase(a);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='o'){
            System.out.println(a+" : Its an vowel");
        }else{
            System.out.println(a+" : Its an consonent");
        }
        sc.close();
    }
    
}
