
import  java.util.*;
public class ReverseNumberUsingRec {
    public static void num(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        num(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        num(n);


    }
}
