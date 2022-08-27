import java.util.*;
//find min index of duplicating array [1 2 3 4 4 4 4 5 6 8]
public class BinarySearch2 {
    public static int minIndex(int[] arr,int tar){
        int i=0;
        int j= arr.length-1;
        int ans=-1;
        while (i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==tar){
                ans=mid;
                j=mid-1;
            }
            else if(arr[mid]<tar){
               i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array");
        int n=sc.nextInt();
        System.out.println("Enter the sorted array");
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the find min index ");
        int tar=sc.nextInt();
        System.out.println("Min index of duplicate value: "+minIndex(arr,tar));

    }
}
