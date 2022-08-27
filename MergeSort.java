import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] arr1,int x1,int y1,int x2,int y2){
        int temp[]=new int[arr1.length];
        int i=x1;
        int j=x2;
        int k=x1;

        while(i<=y1 && j<=y2){
            if(arr1[i]<arr1[j]){
                temp[k++]=arr1[i++];
            }
            else{
                temp[k++]=arr1[j++];
            }
        }
        while (i<=y1){
            temp[k++]=arr1[i++];
        }
        while (j<=y2){
            temp[k++]= arr1[j++];
        }
        for(int p=x1;p<=y2;p++){
            arr1[p]=temp[p];
        }
    }
    //i to m -> first part of merge array
    //m+1 to j -> Second part of merge array
    public static void helper(int arr1[],int l,int r){
        //base logic
        if(l>=r){
            return;
        }
        int m=(l+r)/2;
        helper(arr1,l,m);
        helper(arr1,m+1,r);
        merge(arr1,l,m,m+1,r);

    }
    public static void mergeSort(int[] arr1){
        helper(arr1,0, arr1.length-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter the array");
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]= sc.nextInt();
        }
        mergeSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
