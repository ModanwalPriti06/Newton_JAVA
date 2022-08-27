import java.util.*;
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i=0;i< arr.length;i++){
            int key=arr[i];
            int j=i-1;;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            System.out.println(Arrays.toString(arr));
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
