import java.util.Scanner;
public class BinarySearch {
    public static boolean search(int[] arr,int k){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(arr[m]==k){
                return true;
            }
            else if(arr[m]<k){
                i=m+1;
            }
            else{
                j=m-1;
            }
        }
        return  false;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the find Search Element");
        int k=sc.nextInt();
        System.out.println(search(arr,k));


    }
}
