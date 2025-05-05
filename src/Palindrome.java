import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num to check");
        int num=sc.nextInt();
        String str= Integer.toString(num);
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString())){
            System.out.println(num+" is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
