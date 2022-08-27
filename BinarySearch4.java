import java.util.*;
public class BinarySearch4 {
    public static int insertValue(int[] arr,int tar){
        int i=0;
        int j= arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==tar){
                return mid;
            }
            else if(arr[mid]<tar){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return i;

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
        System.out.println("enter the number for insert ");
        int tar=sc.nextInt();
        System.out.println("Min index of duplicate value: "+insertValue(arr,tar));
    }
}
