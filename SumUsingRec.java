import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class SumUsingRec {
    public static int findSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array number");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(findSum(arr));
    }
}
