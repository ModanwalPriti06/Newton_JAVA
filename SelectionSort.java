import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n= arr.length;
        for(int i=0;i<n;i++){
            int value=i;
            for(int j=i+1;j<n;j++){
                if(arr[value]>arr[j]){
                    value=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[value];
            arr[value]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
