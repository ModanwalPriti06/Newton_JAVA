
import java.util.*;
public class HomeWork {
    public static boolean search(int[] arr,int tar){
        int i=0;
        int j=arr.length;
        while(i<=j){
            if(i+j==tar){
                return true;
            }else if(arr[i]<tar){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("entered array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("target");
        int tar=sc.nextInt();
        System.out.println(search(arr,tar));
    }
}
/**
 input : 5
 1 2 5 4 8
 6 // addition of i+j
 output: true
 */