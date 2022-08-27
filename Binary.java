import java.util.*;
public class Binary {
    public static int BinarySearch(int[] arr,int tar){
        int i=0;
        int j= arr.length;
        int ans=0;
        while(i<j){
            int mid=(i+j)/2;
            if(arr[mid]==tar){
                ans=i;
                return ans;
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
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int tar=sc.nextInt();
       //BinarySearch(arr,tar);
        System.out.println(BinarySearch(arr,tar));

    }
}
