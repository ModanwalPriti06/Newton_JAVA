import java.util.*;
public class SimpleMergeSort {
    static int[] merge(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int len=arr1.length+arr2.length;
        int temp[]=new int[len];
        int k=0;
        while(i<arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                temp[k++]=arr1[i++];
            }
            else{
                temp[k++]=arr2[j++];
            }
        }
        while (i< arr1.length){
            temp[k++]=arr1[i++];
        }
        while(j< arr1.length){
            temp[k++]=arr2[j++];
        }
        return temp;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr1[]=new int[n];
     for (int i=0;i<n;i++){
         arr1[i]=sc.nextInt();
     }
     int m=sc.nextInt();
     int arr2[]=new int[m];
        for (int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
}
